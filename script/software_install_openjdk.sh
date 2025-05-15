#!/usr/bin/env bash
# this script is used to install java openjdk
# 20250508 - mahaiqing - open jdk installation

set -u
set -o pipefail

SCRIPT_PATH=$(cd "$(dirname "$0")" || exit;pwd)
LOGFILE_PATH="$SCRIPT_PATH/logs"
LOGFILE_NAME="01-software-install-openjdk.log"
LOGFILE="$LOGFILE_PATH/$LOGFILE_NAME"

COLOR_RED='\e[1;31m'
COLOR_NC='\e[0m'

if [[ ! -d  "$LOGFILE_PATH" ]]
then
    mkdir -p "$LOGFILE_PATH"
    echo -e "creat directroy($LOGFILE_PATH) to save log($LOGFILE_NAME)  [$(date)] " | tee "$LOGFILE"
fi

os_type=$(grep 'PRETTY_NAME=' /etc/os-release | cut -d '=' -f 2 | tr -d '"')
# 0: success
# others: fail
function install_openjdk() {
    if [ ! -e "$jdk_package_filename" ];
    then
        echo -e "${COLOR_RED}openjdk[$openjdk_version] installation -- operation can't continue as no package ${COLOR_NC}"| tee -a "$LOGFILE"
        return 1
    fi
    tar -zxf "$jdk_package_filename" -C /usr/local

    echo -e "openjdk[$openjdk_version] installation -- notify system jdk location" | tee -a "$LOGFILE"
    if [[ "$os_type" =~ "Ubuntu"  ]]
    then
        update-alternatives --install "/usr/bin/${openjdk_version}" "$openjdk_version" "$java_home_directory/bin/java" 1
    else
        echo -e "${COLOR_RED}can't deal with current os:${os_type}  ${COLOR_NC}"| tee -a "$LOGFILE"
        exit 1
    fi

    echo -e "openjdk[$openjdk_version] installation -- check the jdk version" | tee -a "$LOGFILE"
    check_results=$("$openjdk_version" -version 2>&1)
    echo -e "check results openjdk[$openjdk_version]: \n$check_results " | tee -a "$LOGFILE"
    if [[ $check_results =~ "command not found" ]]
    then
        return 1
    fi

    if [[ $openjdk_version = "java" ]]
    then
        check_java_home=$(grep 'JAVA_HOME=' /etc/profile )
        if [ -n "$check_java_home" ]
        then
            echo -e "add java environment to /etc/profile. " | tee -a "$LOGFILE"
            {
                echo JAVA_HOME="$java_home_directory"
                echo "export PATH=${JAVA_HOME}/bin:$PATH"
            } >> /etc/profile
        else
            echo -e "It seems java environment already exists in /etc/profile. " | tee -a "$LOGFILE"
        fi
    fi

    if [[ $check_results =~ "openjdk" ]]
    then
        return 0
    else
        return 2
    fi
}


# 0 : do not need to install openjdk
# others: whereis no jdk or configuration is not right
function check_openjdk() {
    check_results=$(whereis "$openjdk_version" 2>&1)
    command_location=${check_results#*:}
    echo "check openjdk[$openjdk_version] command location is : $command_location" | tee -a "$LOGFILE"
    if ! [[ $command_location =~ "java" ]]; then
        return 3
    fi
    check_results=$("$openjdk_version" -version 2>&1)
    echo -e "check openjdk[$openjdk_version] results are: \n$check_results" | tee -a "$LOGFILE"
    if [[ $check_results =~ "openjdk version" ]]
    then
        echo "openjdk[$openjdk_version] checking -- it seems openjdk has installed. Check detail information ..."  | tee -a "$LOGFILE"
        check_results=$(ls -l /usr/bin/"$openjdk_version")
        echo "openjdk[$openjdk_version] checking -- ${openjdk_version} base info($check_results)" | tee -a "$LOGFILE"
        check_results=$(ls -l /etc/alternatives/"$openjdk_version")
        if [[ $openjdk_version = "java" && $check_results =~ 23.0.2 ]]; then
            echo -e "openjdk[$openjdk_version] checking -- it seems openjdk version and configuration($check_results) are as expected." | tee -a "$LOGFILE"
            return 0
        else
            echo "openjdk[$openjdk_version] checking -- openjdk configuration($check_results) is not as expected. install it..." | tee -a "$LOGFILE"
            return 2
        fi
    else
        return 1
    fi
}

# check openjdk java23
jdk_package_filename="openjdk-23.0.2_linux-x64_bin.tar.gz"
java_home_directory="/usr/local/jdk-23.0.2"
openjdk_version="java"
echo -e "\nThis is going to check openjdk ${openjdk_version} [$(date)] " | tee  -a "$LOGFILE"

if ! check_openjdk
then
    echo "This is going to install openjdk ${openjdk_version} [$(date)] " | tee  -a "$LOGFILE"
    if ! install_openjdk
    then
        echo -e "${COLOR_RED}openjdk install -- ${openjdk_version} install failed.${COLOR_NC}"| tee -a "$LOGFILE"
    else
        echo "openjdk install -- ${openjdk_version} install successfully." | tee -a "$LOGFILE"
    fi
fi


echo "openjdk installation -- finished-------------------[$(date)] " | tee  -a "$LOGFILE"
