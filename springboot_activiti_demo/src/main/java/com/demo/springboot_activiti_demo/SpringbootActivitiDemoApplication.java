package com.demo.springboot_activiti_demo;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringbootActivitiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActivitiDemoApplication.class, args);
    }

}
