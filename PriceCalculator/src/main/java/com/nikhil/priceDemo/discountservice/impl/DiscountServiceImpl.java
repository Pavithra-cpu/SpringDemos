package com.nikhil.priceDemo.discountservice.impl;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.nikhil.priceDemo.discountservice.DiscountService;
import com.nikhil.priceDemo.model.Product;


@Component
public class DiscountServiceImpl implements DiscountService {

	@Override
	public double calculateDiscount(Product product) {
		
		String productType = product.getProductType();
		
		double price = product.getProductPrice();
		double discount = 0;

		
		if(productType.equals("Electronics"))
		{
			discount = 0.25 * price;
		}
		else if(productType.equals("Toys")) {
			discount = 0.5 * price;
		}
		else discount = 0.01 * price;
		double finalPrice = price - discount;
		return finalPrice;
	}

}
