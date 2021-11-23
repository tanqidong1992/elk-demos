#!/bin/bash
cd register
mvn spring-boot:run &
echo $! > target/run.pid
cd ..
cd api-gateway
mvn spring-boot:run &
echo $! > target/run.pid
cd ..
cd backing-service
mvn spring-boot:run &
echo $! > target/run.pid
cd ..
cd front-service
mvn spring-boot:run &
echo $! > target/run.pid
cd ..