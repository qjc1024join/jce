package com.qjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.print.DocFlavor;

@RestController
public class EurekaController {
    private static  final String EUREKA_ADDRESS="http://EUREKA-CLIENT";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get/hello")
    public String get(){
        String object = restTemplate.getForObject(EUREKA_ADDRESS + "/hello", String.class);
        return object;
    }
}
