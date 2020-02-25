package com.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class UserClaim {
	
	private String expenseType;
	
	
	 @Positive

	 private double expenseAmt;

	 //Validating for not null and size

	 @NotEmpty(message="empty")

	 @Size(min=5, message="Employee ID should be at least 5 characters")
	private String employeeId;
	
	public String getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}
	public double getExpenseAmt() {
		return expenseAmt;
	}
	public void setExpenseAmt(double expenseAmt) {
		this.expenseAmt = expenseAmt;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
}
