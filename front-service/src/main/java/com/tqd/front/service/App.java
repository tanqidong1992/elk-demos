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
@EnableFeignClients(basePackageClasses =  SampleClient.class)
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
