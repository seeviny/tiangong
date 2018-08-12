package com.biseetech.cms.article.service;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/article")
public interface ArticleService {
    @RequestMapping("/info")
    String getArticleInfo(String articleTitle);
}
