package com.example.druid_test.controller;

import com.example.druid_test.entity.User;
import com.example.druid_test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

/**
 * 验证数据
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/getUser")
    @ResponseBody
    public User getUserById(@RequestParam("id") String id){
         User user= testService.getUserById(id);
         return user;
    }

}
