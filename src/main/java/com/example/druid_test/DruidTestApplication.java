package com.example.druid_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@MapperScan("com.example.druid_test.dao")
public class DruidTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruidTestApplication.class, args);
    }

}
