package com.cts.innerbean;

import org.springframework.beans.factory.annotation.Autowired;

public class studentInfo {

	
	private Student student;

	public Student getStudent() {
		return student;
	}
	@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void displaystudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("---------------");
		System.out.println("Student No: "+student.getId());
		System.out.println("Student Name "+student.getName());
	}

	
}
