package com.offer.database.controller;

import com.offer.database.bean.User;
import com.offer.database.repository.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    UserRepos userRepos;
    @RequestMapping(value = "getById")
    public User getById(String id){
        return  userRepos.getOne(id);
    }
}
