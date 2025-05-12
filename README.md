1: java 版本

    安装 jdk23
    $ java --version
    java 23.0.1 2024-10-15
    Java(TM) SE Runtime Environment (build 23.0.1+11-39)
    Java HotSpot(TM) 64-Bit Server VM (build 23.0.1+11-39, mixed mode, sharing)

2: 安装 maven

    $ mvn --version
    Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
    Maven home: /Users/youxuehu/SDK/apache-maven-3.6.3
    Java version: 23.0.1, vendor: Oracle Corporation, runtime: /Users/youxuehu/SDK/jdk-23/jdk-23.0.1.jdk/Contents/Home
    Default locale: zh_CN_#Hans, platform encoding: UTF-8
    OS name: "mac os x", version: "14.4.1", arch: "x86_64", family: "mac"
    
3: 执行编译命令

    mvn clean package

4: 编译后获得的 jar 文件

    target/yeying-sdk-java-1.0.jar