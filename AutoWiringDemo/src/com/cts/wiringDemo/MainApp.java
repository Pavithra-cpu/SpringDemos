package com.cts.wiringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Student s = ctx.getBean("std",Student.class);
		s.display();
	}

}
