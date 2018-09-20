package com.example.demo.manage.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by yanwen.liu on 2018/7/2.
 */
@Component
@Slf4j
public class RedisServiceImpl {
    @Autowired
    private StringRedisTemplate template;

    public void setValue(String key, String value) {
        template.opsForValue().set(key, value);
    }

    public String getValue(String key) {
        String value = template.opsForValue().get(key);
        return value;
    }

    public boolean delValue(String key) {
        boolean result = template.delete(key);
        return result;
    }
}
