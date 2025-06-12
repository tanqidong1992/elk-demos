package com.tqd.front.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.tqd.front.service.rpc.SampleClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@EnableFeignClients(basePackageClasses =  SampleClient.class)
public class FrontApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(FrontApp.class, args);
    }
}
