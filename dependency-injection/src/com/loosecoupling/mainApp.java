package com.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
System.out.println("beans.xml file loaded....");
Student s=ctx.getBean("std",Student.class);
s.cheating();
	}

}
