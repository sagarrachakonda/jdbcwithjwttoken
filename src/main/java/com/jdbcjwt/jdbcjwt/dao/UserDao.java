package com.jdbcjwt.jdbcjwt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private JdbcTemplate jdbcTemplate;
    public UserDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int CreateTable(){
        String query = "CREATE TABLE IF NOT EXISTS User(id int primary key , name varchar(200) , age int , city varchar(100))";
        int update = this.jdbcTemplate.update(query);
        return update;
    }
    public int InsertUser(Integer id, String name, Integer age, String city){
        String query = "insert into user(id,name,age,city) values(?,?,?,?)";
        int update = this.jdbcTemplate.update(query, new Object[]{id, name, age, city});
        return update;
    }
}
