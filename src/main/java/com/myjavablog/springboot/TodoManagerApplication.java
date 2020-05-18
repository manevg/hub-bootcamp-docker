package com.myjavablog.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages="com.myjavablog.springboot.repository")
public class TodoManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoManagerApplication.class, args);
	}
}
