package com.jdbcjwt.jdbcjwt.controller;


import com.jdbcjwt.jdbcjwt.dao.UserDao;
import com.jdbcjwt.jdbcjwt.model.User;
import com.jdbcjwt.jdbcjwt.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeToken {

    private UserService userService;
    private UserDao userDao;
    public HomeToken(UserService userService, UserDao userDao) {
        this.userService = userService;
        this.userDao = userDao;
    }

    @GetMapping("/user")
    public List<User> getUser(){
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

    @GetMapping("/userdata")
    public String test(){
        return this.userService.createusers();
    }

}
