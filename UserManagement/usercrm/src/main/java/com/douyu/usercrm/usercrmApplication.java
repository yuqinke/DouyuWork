package com.douyu.usercrm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.douyu.usercrm.dao")
//启动类
public class usercrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(usercrmApplication.class, args);

    }

}
