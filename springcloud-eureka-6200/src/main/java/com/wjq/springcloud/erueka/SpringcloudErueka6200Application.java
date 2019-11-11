package com.wjq.springcloud.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudErueka6200Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudErueka6200Application.class, args);
    }

}
