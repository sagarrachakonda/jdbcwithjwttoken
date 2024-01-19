package com.jdbcjwt.jdbcjwt.service;

import com.jdbcjwt.jdbcjwt.dao.UserDao;
import com.jdbcjwt.jdbcjwt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private UserDao userDao;
    private List<User> store = new ArrayList<>();

    public UserService(UserDao userDao) {
        this.userDao = userDao;
        store.add(new User(UUID.randomUUID().toString(),"John","John@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"brad","brad@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"hash","hash@gmail.com"));
    }

    public List<User> getUsers() {
        return store;
    }

    public String createusers(){
        this.userDao.CreateTable();
        int i = this.userDao.InsertUser(3, "khush", 32, "Hyderabad");
        return i+":-created user";
    }
}
