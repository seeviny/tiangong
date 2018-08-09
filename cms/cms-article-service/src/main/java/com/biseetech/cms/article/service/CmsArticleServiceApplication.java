package com.biseetech.cms.article.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class CmsArticleServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmsArticleServiceApplication.class, args);
    }
}
