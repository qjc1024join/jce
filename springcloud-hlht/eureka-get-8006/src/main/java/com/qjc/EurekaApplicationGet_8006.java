package com.qjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaApplicationGet_8006 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationGet_8006.class,args);
    }
}
