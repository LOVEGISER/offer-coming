package com.offer.mybatis.controller;

import com.offer.mybatis.bean.User;
import com.offer.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    UserService userService;

    @RequestMapping(value = "getById")
    public User getById(String id){
       return userService.getById(id);
    }
}
