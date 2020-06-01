package com.douyu.choujiang.serviceImpl;

import com.douyu.choujiang.dao.UserDAO;
import com.douyu.choujiang.entity.User;
import com.douyu.choujiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional              //控制事务
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDAO userDAO;
    @Override
    //用户注册
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    //用户登录
    public User login(String username,String password){
        return userDAO.findByUsernameAndPassword(username,password);
    }
}
