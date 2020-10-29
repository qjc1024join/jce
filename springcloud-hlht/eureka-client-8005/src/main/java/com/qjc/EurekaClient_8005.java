package com.qjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient_8005 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient_8005.class,args);
    }
}
