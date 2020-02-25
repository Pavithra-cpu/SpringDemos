package com.nikhil.priceDemo.discountservice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import com.nikhil.priceDemo.model.Product;

@Service

public interface DiscountService {
	public double calculateDiscount(Product product);
}
