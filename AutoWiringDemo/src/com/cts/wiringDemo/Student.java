package com.cts.wiringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
@Autowired
@Qualifier("englishExam")
	private Exam exam;

	/*public Student() {

	}
	
	

	public Student(Exam exam) {
		super();
		this.exam = exam;
		System.out.println("constructor is getting called");
	}

	@Autowired
	@Qualifier("englishExam")
	public void setExam(Exam exam) {
		this.exam = exam;
		System.out.println("Setter method is getting called ");
	}
*/
	public void display() {
		exam.semester();
		System.out.println("Name of exam is "+exam.getNameofExam() + "Number of attempts is "+
		exam.getNoofAttempts());
	}
}
