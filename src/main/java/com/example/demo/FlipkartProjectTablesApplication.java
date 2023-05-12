package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.example.demo.dao")
@EntityScan(basePackages="com.example.demo.entity")
@SpringBootApplication(scanBasePackages="com.example")
public class FlipkartProjectTablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartProjectTablesApplication.class, args);
	}

}
