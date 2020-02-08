package com.model.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



public class AppConfig {
	
	@Bean(name= {"studentInfo"})
	public Student student()
	{
		Student student=new Student();
		//student.setId(1);
		//student.setStudName("aaa");
		
		//student.setId(2);
		/*
		 * student.setStudName("bbb");
		 * 
		 * student.displayInfo();
		 */
		return student;
	}

}
