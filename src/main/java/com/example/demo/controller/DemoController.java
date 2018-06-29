package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanwen.liu on 2018/6/28.
 */
// @RestController 默认类中的方法都会以json的格式返回
@RestController
@Slf4j
public class DemoController {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private String age;

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        log.error("test");
        return "hello spring boot!" + name + ":" + age;
    }

    @RequestMapping("/user")
    public String queryUserById() {
        User user = userService.selectByPrimaryKey(1);
        return user.toString();
    }


}
