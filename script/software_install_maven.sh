#!/usr/bin/env bash
# this script is used to install maven
# 20250510 - mahaiqing - open jdk installation

set -u
set -o pipefail

SCRIPT_PATH=$(cd "$(dirname "$0")" || exit;pwd)
LOGFILE_PATH="$SCRIPT_PATH/logs"
LOGFILE_NAME="02-software-install-maven.log"
LOGFILE="$LOGFILE_PATH/$LOGFILE_NAME"

COLOR_RED='\e[1;31m'
COLOR_NC='\e[0m'

if [[ ! -d  "$LOGFILE_PATH" ]]
then
    mkdir -p "$LOGFILE_PATH"
    echo -e "creat directroy($LOGFILE_PATH) to save log($LOGFILE_NAME)  [$(date)] " | tee "$LOGFILE"
fi

# 0: success
# others: fail
function install_maven() {
    if [ ! -e "$maven_package_filename" ];
    then
        echo -e "${COLOR_RED}maven installation -- operation can't continue as no package ${COLOR_NC}"| tee -a "$LOGFILE"
        return 1
    fi
    tar -zxf "$maven_package_filename" -C /usr/local

    check_maven_home=$(grep 'MAVEN_HOME=' /etc/profile )
    if [ -n "$check_maven_home" ]
    then
        echo -e "add maven environment to /etc/profile. " | tee -a "$LOGFILE"
        {
            echo MAVEN_HOME="$maven_home_directory"
            echo "export PATH=${MAVEN_HOME}/bin:$PATH"
        } >> /etc/profile
    else
        echo -e "It seems maven environment already exists in /etc/profile. " | tee -a "$LOGFILE"
    fi


    if [[ $check_results =~ "maven" ]]
    then
        return 0
    else
        return 2
    fi
}


# 0 : do not need to install maven
# others: whereis no jdk or configuration is not right
function check_maven() {
    check_results=$(whereis mvn 2>&1)
    command_location=${check_results#*:}
    echo "check maven command location is : $command_location" | tee -a "$LOGFILE"
    if ! [[ $command_location =~ "apache-maven" ]]; then
        return 3
    fi
    check_results=$(mvn -version 2>&1)
    echo -e "check maven version results are: \n$check_results" | tee -a "$LOGFILE"
    if [[ $check_results =~ "Apache Maven" ]]
    then
        echo -e "maven version and configuration: \n$check_results" | tee -a "$LOGFILE"
        return 0
    else
        return 1
    fi
}

# check maven java23
maven_package_filename="apache-maven-3.9.9-bin.tar.gz"
maven_home_directory="/usr/local/apache-maven-3.9.9"
maven_version="3.9.9"
echo -e "\nThis is going to check maven [$(date)] " | tee  -a "$LOGFILE"

if ! check_maven
then
    echo "This is going to install maven [$(date)] " | tee  -a "$LOGFILE"
    if ! install_maven
    then
        echo -e "${COLOR_RED}maven install -- ${maven_version} install failed.${COLOR_NC}"| tee -a "$LOGFILE"
    else
        echo "maven install -- ${maven_version} install successfully." | tee -a "$LOGFILE"
    fi
fi

echo "maven installation -- finished-------------------[$(date)] " | tee  -a "$LOGFILE"
