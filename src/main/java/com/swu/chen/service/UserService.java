package com.swu.chen.service;

import com.swu.chen.entity.User;
import com.swu.chen.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User test(){
        User user = userMapper.selectById(6);
        return user;
    }
}
