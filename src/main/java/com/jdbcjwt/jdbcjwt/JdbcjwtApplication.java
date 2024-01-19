package com.jdbcjwt.jdbcjwt;

import com.jdbcjwt.jdbcjwt.dao.UserDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcjwtApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JdbcjwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Springboot Applicaion Started");
	}
}
