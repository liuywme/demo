package com.example.demo;

import com.example.demo.manage.impl.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yanwen.liu on 2018/7/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {

    @Autowired
    MailServiceImpl mailService;

    @Test
    public void sendMail() {
        mailService.sendSimpleMail("di0036465huijia6@163.com", "test simple mail", " hello this is simple mail");
    }

}
