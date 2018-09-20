package com.example.demo;

import com.example.demo.manage.impl.RedisServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yanwen.liu on 2018/6/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceImplTest {

    @Autowired
    private RedisServiceImpl redisService;

    @Test
    public void setValue() {
        redisService.setValue("test", "中文测试");
    }

    @Test
    public void getValue() {
        System.out.println(redisService.getValue("test"));
    }

    @Test
    public void delValue() {
        System.out.println(redisService.delValue("test"));
    }

}
