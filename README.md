1: java 版本
    安装 openjdk23

    下载地址：https://download.java.net/java/GA/jdk23.0.2/6da2a6609d6e406f85c491fcb119101b/7/GPL/openjdk-23.0.2_linux-x64_bin.tar.gz

    安装指导： 在Ubuntu环境中可以执行bash software_install_openjdk.sh
    （script/software_install_openjdk.sh安装文件和脚本在同一目录下）

    $ java --version
    openjdk 23.0.2 2025-01-21
    OpenJDK Runtime Environment (build 23.0.2+7-58)
    OpenJDK 64-Bit Server VM (build 23.0.2+7-58, mixed mode, sharing)


2: 安装 maven

    下载地址： https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.tar.gz

    安装指导： 参考script/software_install_maven.sh （安装依赖java）

    $ mvn --version
    Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
    Maven home: /usr/local/apache-maven-3.9.9


3: 编译命令

    mvn clean package
