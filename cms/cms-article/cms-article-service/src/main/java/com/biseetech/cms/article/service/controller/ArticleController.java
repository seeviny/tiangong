package com.biseetech.cms.article.service.controller;

import com.biseetech.cms.article.service.ArticleService;
import com.biseetech.cms.article.service.remoteservice.user.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController implements ArticleService {
    @Autowired
    private UserServiceApi userServiceApi;

    public String getArticleInfo(String articleTitle) {
        return String.format("article:%s, username:%s", articleTitle, this.userServiceApi.getUserName(111L));
    }
}
