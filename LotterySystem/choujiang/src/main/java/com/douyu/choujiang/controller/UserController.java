package com.douyu.choujiang.controller;

import com.douyu.choujiang.entity.User;
import com.douyu.choujiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //开发用户注册功能
    @PostMapping("regist")
    public String regist(User user){
        System.out.println("user="+user);
        userService.save(user);
        return "redirect:/web/login.jsp";
    }

    //开发用户登录
    @RequestMapping("login")
    public String login(String username, String password){
        User user=userService.login(username,password);
        //判断 user为空，用户名密码错误
        if(user!=null){
            return "redirect:/web/draw.jsp";//跳转抽奖页面
        }else{
            return "redirect:/web/login.jsp";//重新登录
        }
    }
}
