package com.model.demo2;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value(value="1001")
	private int id;
	@Value(value="pavithra")
	private String studName;

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Student(int id, String studName) {
		super();
		this.id = id;
		this.studName = studName;
	}

	public void displayInfo() {
		System.out.println("Student name & id is " + studName + id);
		// System.out.println("Student Id "+ id);

	}
}
