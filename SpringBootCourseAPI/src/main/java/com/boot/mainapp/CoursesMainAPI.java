package com.boot.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.boot")
public class CoursesMainAPI {

	public static void main(String[] args) {
		SpringApplication.run(CoursesMainAPI.class, args);
	}
}
