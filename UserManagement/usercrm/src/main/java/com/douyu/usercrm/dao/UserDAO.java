package com.douyu.usercrm.dao;

import com.douyu.usercrm.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    //保存用户的方法
    void save(User user);
    //登录的方法
    User findByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
    //修改用户密码
    void reset(@Param("newpassword") String newpassword,@Param("username") String username);
}
