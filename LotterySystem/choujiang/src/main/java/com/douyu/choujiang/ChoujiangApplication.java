package com.douyu.choujiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.douyu.choujiang.dao")
public class ChoujiangApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChoujiangApplication.class, args);

    }

}
