package com.douyu.usercrm.service;

import com.douyu.usercrm.entity.User;

public interface UserService {
    //保存用户接口
    void save(User user);

    //登录功能
    User login(String username,String password);

    //修改用户密码
    void reset(String newpassword, String username);
}
