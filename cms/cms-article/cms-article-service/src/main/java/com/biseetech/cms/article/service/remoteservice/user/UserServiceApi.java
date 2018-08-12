package com.biseetech.cms.article.service.remoteservice.user;

import com.biseetech.cms.user.service.api.service.UserService;
import com.biseetech.cms.user.service.api.service.UserServiceConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(UserServiceConstants.SERVICE_NAME)
public interface UserServiceApi extends UserService {
}
