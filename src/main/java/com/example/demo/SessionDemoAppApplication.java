package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages= {"com.example.repo"}) // for repository scannings
@EntityScan(basePackages= {"com.example.beans"}) // for entity scannings
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.learn.bean","com.example.controller","com.example.repo"
		,"com.example.services"})

public class SessionDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionDemoAppApplication.class, args);
		System.out.println("WELCOME TO SESSION BOOKING");
	}

}
