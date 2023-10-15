package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class AppacheDearby1Application implements CommandLineRunner {

	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(AppacheDearby1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Users -> {}", dao.findAll());

	}

}
