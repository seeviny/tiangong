package com.biseetech.cms.article.service.controller.remoteservice;

import com.biseetech.cms.user.service.api.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("cms-user-service")
public interface UserServiceApi extends UserService {
}
