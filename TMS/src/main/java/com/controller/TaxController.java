package com.controller;

import java.util.ArrayList;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.model.UserClaim;

import com.service.TaxService;

@Controller

public class TaxController {

	// Autowiring the taxService business class

	@Autowired

	TaxService taxService;

	// Displaying the taxclaim page

	@RequestMapping(value = "/getTaxClaimFormPage", method = RequestMethod.GET)

	public String claimPage(@ModelAttribute("userClaim") UserClaim userClaim) {

		return "taxclaim";

	}

	// Handling the validations and redirecting to the appropriate page

	@RequestMapping(value = "/calculateTax", method = RequestMethod.GET)

	public String calculateTax(@Valid @ModelAttribute("userClaim") UserClaim userClaim, BindingResult result,
			Model model) {

		if (result.hasErrors()) {

			return "taxclaim";

		}

		model.addAttribute("taxClaimAmount", taxService.calculateTax(userClaim));

		return "result";

	}

	// Auto populating the form with the expenseType element

	@ModelAttribute("expenseList")

	public List<String> populateExpense() {

		List<String> expenseType = new ArrayList<>();

		expenseType.add("MedicalExpense");

		expenseType.add("TravelExpense");

		expenseType.add("FoodExpense");

		return expenseType;

	}

}