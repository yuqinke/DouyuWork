package com.douyu.usercrm;

import com.douyu.usercrm.dao.UserDAO;
import com.douyu.usercrm.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@SpringBootTest(classes = usercrmApplication.class)
@RunWith(SpringRunner.class)
public class TestUserDAO {

    @Autowired
    private UserDAO userDAO;

    @Test
    //用户注册
    public void testsave(){
        userDAO.save(new User(UUID.randomUUID().toString(),"wangmazi","王麻子","123456","女")); //生成主键
        System.out.println("用户注册成功");
    }

    @Test
    //用户登录
    public  void testlogin(){
       User user =  userDAO.findByUsernameAndPassword("yuqinke","123456");
        System.out.println(user.toString()+"用户登录成功");
    }

    @Test
    //重置用戶密碼
    public void testreset(){
        userDAO.reset("1234567","yuqinke");
        System.out.println("密码重置成功");
    }
}
