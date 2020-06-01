package com.douyu.choujiang.service;

import com.douyu.choujiang.entity.User;

public interface UserService {
    //保存用户接口
    void save(User user);

    //登录功能
    User login(String username,String password);
}
