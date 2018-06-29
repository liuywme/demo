package com.example.demo.service;

import com.example.demo.model.User;

/**
 * Created by yanwen.liu on 2018/6/29.
 */
public interface UserService {
    User selectByPrimaryKey(int id);
}
