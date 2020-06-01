package com.douyu.usercrm.serviceImpl;

import com.douyu.usercrm.dao.UserDAO;
import com.douyu.usercrm.entity.User;
import com.douyu.usercrm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional              //控制事务
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDAO.save(user);
    }
    @Override
    public User login(String username,String password){

        return userDAO.findByUsernameAndPassword(username,password);
    }

    @Override
    public void reset(String newpassword, String username) {
        userDAO.reset(newpassword,username);
    }
}
