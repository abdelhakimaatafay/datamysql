package com.example.datamysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatamysqlApplication {
	private static final Logger log = LoggerFactory.getLogger(DatamysqlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DatamysqlApplication.class, args);
	}

}
