#!/bin/bash
function waitForSuccess(){
    startTime=$SECONDS
    while [ 1==1 ]; do
        currentTime=SECONDS
        let dt=currentTime-startTime
        if [ $dt -ge 5 ];then
            break;
        fi
    done
}
cd config-server
mvn spring-boot:run &
echo $! > target/run.pid
cd ..
waitForSuccess
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