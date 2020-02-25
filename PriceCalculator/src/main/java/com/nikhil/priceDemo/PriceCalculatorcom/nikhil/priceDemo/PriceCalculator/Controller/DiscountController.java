package com.nikhil.priceDemo.PriceCalculatorcom.nikhil.priceDemo.PriceCalculator.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nikhil.priceDemo.discountservice.DiscountService;
import com.nikhil.priceDemo.model.Product;

@Controller

public class DiscountController {
	@Autowired
	DiscountService discountService;

	@RequestMapping(value = "/getDiscountedPrice", method = RequestMethod.GET)
	public String discountPage(@ModelAttribute("product") Product product) {
		return "calculatediscount";
	}

	@ModelAttribute("productTypeList")
	public List<String> populateProductType() {

		List<String> list = new ArrayList<>();
		list.add("Electronics");
		list.add("Toys");
		list.add("Apparels");
		return list;
	}

	@RequestMapping(value = "/finalprice", method = RequestMethod.POST)
	public String calculateTotalCost(@Valid @ModelAttribute("product")Product product,BindingResult result,  ModelMap model) {
		
		if(result.hasErrors())
			return "calculatediscount";
		
		model.addAttribute("totalCost", discountService.calculateDiscount(product));
			
		
		return "finalprice";

	}
}
