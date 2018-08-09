package com.biseetech.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CmsServiceEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmsServiceEurekaApplication.class, args);
    }
}
