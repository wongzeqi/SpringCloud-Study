package com.wjq.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudConsumer7100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumer7100Application.class, args);
    }

}
