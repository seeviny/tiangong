package com.biseetech.cms.article.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/checkhealth")
    public String checkHealth() {
        return "hello";
    }

    @RequestMapping("/status")
    public String status() {
        return "cms-article-service started!";
    }
}
