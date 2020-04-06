package com.offer.mybatis.service;

import com.offer.mybatis.bean.User;
import com.offer.mybatis.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getById(String id){
       return userMapper.selectById(id);
    }
}
