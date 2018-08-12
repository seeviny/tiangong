package com.biseetech.cms.user.service.controller;

import com.biseetech.cms.user.service.api.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserService {
    @Override
    public String getUserName(Long id) {
        return "UserName:" + id;
    }
}
