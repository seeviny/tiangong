package com.biseetech.cms.user.service.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
public interface UserService {
    @RequestMapping("/name")
    String getUserName(@RequestParam("id") Long id);
}
