package com.biseetech.cms.article.service.controller;

import com.biseetech.cms.article.service.controller.remoteservice.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping("/info")
    public String getArticleInfo(String articleTitle) {
        return String.format("article:%s, username:%s", articleTitle, this.userServiceApi.getUserName(111L));
    }
}
