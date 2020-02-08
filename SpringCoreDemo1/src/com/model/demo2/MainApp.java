package com.model.demo2;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		/*
		 * ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		 * Student std=ctx.getBean("std",Student.class); std.displayInfo();
		 * 
		 * 
		 * Student std1=ctx.getBean("std1",Student.class); std1.displayInfo();
		 */
		 
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Student s=ctx.getBean("studentInfo",Student.class);
		/*
		 * s.setStudName("aaa"); s.setId(1001);
		 */
		s.displayInfo();
		//ctx.close();
	}

}
