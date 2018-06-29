package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yanwen.liu on 2018/6/29.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
