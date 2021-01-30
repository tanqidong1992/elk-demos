# SpringCloud+ELK+Zipkin示例
这是一个使用ELK收集微服务的日志,并使用Zipkin做微服务调用链路追踪的示例项目.

项目构建了一个简单的微服务，包括API网关，注册中心以及两个示例子服务，用来演示ELK和Zipkin的功能。
## 目录说明
```shell
#tree -L 1
.
├── api-gateway          #API网关项目代码
├── backing-service      #示例子服务代码
├── common-config        #一些通用配置
├── docker               #ELK+Zipkin docker compose运行配置
├── front-service        #示例子服务代码
├── log-viewer           #集成链路分析与日志的子项目
├── pom.xml              #微服务父Maven POM配置
├── ReadMe.md            #自序文件
└── register             #注册中心代码
```
## 使用
### 环境依赖
- 操作系统 Linux Mint 20.1 64bit
- Docker version 20.10.2
- docker-compose version 1.27.3
- openjdk version "11.0.9" 2020-10-20 
- Apache Maven 3.6.2
### 启动ELK以及Zipkin
```shell
cd docker
docker-compose up
```
### 启动微服务
```shell
cd register && mvn spring-boot:run
cd api-gateway && mvn spring-boot:run
cd backing-service && mvn spring-boot:run
cd front-service && mvn spring-boot:run
```
### 发起示例请求
使用浏览器发送如下请求
- http://localhost:8081/FRONT-SERVICE/greet?msg=test
-  http://localhost:8081/FRONT-SERVICE/echo?msg=test
### 查看调用链路
用浏览器打开Zipkin主页：http://localhost:9411/
### 查看日志
使用浏览器打开主页: http://localhost:5601/
