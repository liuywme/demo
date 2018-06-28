package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
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

    @RequestMapping("/hello")
    public String hello() {
        log.error("test");
        return "hello spring boot!" + name + ":" + age;
    }
}
