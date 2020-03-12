package com;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication

// Scanning the packages

@ComponentScan("com")

public class TmsApplication {



 public static void main(String[] args) {

 SpringApplication.run(TmsApplication.class, args);

 }



}

