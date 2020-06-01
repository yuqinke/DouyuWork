package com.douyu.usercrm.controller;

import com.douyu.usercrm.entity.User;
import com.douyu.usercrm.service.UserService;
import com.douyu.usercrm.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController {

    //生成验证码的方法
    @GetMapping("getImage")
    public void getImage(HttpSession session, HttpServletResponse response) throws IOException {
        //生成验证码
        String securityCode=ValidateImageCodeUtils.getSecurityCode();
        //将验证码放入session
        session.setAttribute("code",securityCode);
        //生成图片
        BufferedImage image=ValidateImageCodeUtils.createImage(securityCode);
        //输出图片
        ServletOutputStream os=response.getOutputStream();
        //调用工具类
        ImageIO.write(image,"png",os);
    }

    @Autowired
    private UserService userService;

    //开发用户注册功能
    @PostMapping("regist")
    public String regist(User user,String code,HttpSession session){
        System.out.println("user="+user);
        //1.判断验证码是否通过
        if(session.getAttribute("code").toString().equalsIgnoreCase(code)){//2.通过之后注册
            userService.save(user);
            return "redirect:/web/login.jsp";//  /webapp/web/login.jsp  /login  都可以访问
        }else{//3.验证码不通过，直接回到注册页面
            return "redirect:/web/regist.jsp";
        }
    }
    //用户更改密码
    @PostMapping("reset")
    public String reset(String username, String password,String newpassword){
        User user=userService.login(username,password);
        System.out.println("user="+user);
        System.out.println(newpassword);
        if(user!=null){
            userService.reset(newpassword,username);
            return "redirect:/web/login.jsp";
        }else{//用戶不存在，直接返回登陸頁面
            return "redirect:/web/regist.jsp";
        }
    }

    //开发用户登录
    @RequestMapping("login")
    public String login(String username,String password,HttpSession session){
        User user=userService.login(username,password);
        //判断 user为空，用户名密码错误
        if(user!=null){
            session.setAttribute("user",user);
            return "redirect:/emp/findAll";//查询员工所有信息
        }else{
            return "redirect:/web/login.jsp";
        }

    }
}
