package com.nikhil.priceDemo.model;

import javax.validation.constraints.DecimalMin;

public class Product {

	@DecimalMin(value = "1.0", inclusive = true, message = "Price cannot be empty")
	private double productPrice;
	@org.hibernate.validator.constraints.NotBlank(message = "Please choose a product type")
	private String productType;

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
}
