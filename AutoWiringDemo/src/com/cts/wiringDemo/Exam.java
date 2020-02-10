package com.cts.wiringDemo;

public class Exam {

	private String nameofExam;
	private int noofAttempts;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNameofExam() {
		return nameofExam;
	}

	public void setNameofExam(String nameofExam) {
		this.nameofExam = nameofExam;
	}

	

	public int getNoofAttempts() {
		return noofAttempts;
	}

	public void setNoofAttempts(int noofAttempts) {
		this.noofAttempts = noofAttempts;
	}

	public void semester() {
		System.out.println("Semester exam has started ");
	}
}
