1: java 版本

    安装 jdk23
    $ java --version
    java 23.0.1 2024-10-15

2: 安装 maven

    $ mvn --version
    Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
    
3: 发包命令

    mvn clean deploy -Dgpg.passphrase=你的密码 -Dgpg.keyname=你的gpg-key
