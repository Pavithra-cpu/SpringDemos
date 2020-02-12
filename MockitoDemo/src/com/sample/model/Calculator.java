package com.sample.model;


public class Calculator {

	CalculatorService service;
	
	public Calculator()
	{
		
	}
	public Calculator(CalculatorService service) {
		
		this.service = service;
	}
	
	public int perform(int i,int j)
	{
		//return i+j;
		return service.add(i,j)*i;
	}
	
}
