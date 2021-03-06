package com.lego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LgItemService {
    public static void main(String[] args) {
        SpringApplication.run(LgItemService.class,args);
    }
}
