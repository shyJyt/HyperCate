package org.ctrlacv.service;

import org.ctrlacv.dto.UserLoginDTO;
import org.ctrlacv.entity.User;

public interface UserService {

    /**
     * 微信登录
     *
     * @param userLoginDTO
     * @return
     */
    public User wxLogin(UserLoginDTO userLoginDTO);
}
