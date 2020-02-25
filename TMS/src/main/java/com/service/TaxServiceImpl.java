package com.service;

import org.springframework.stereotype.Component;

import com.model.UserClaim;

@Component
public class TaxServiceImpl implements TaxService {

	@Override
	public double calculateTax(UserClaim userClaim) {
		String expenseType = userClaim.getExpenseType();
		double expenseAmt = userClaim.getExpenseAmt(), discount = 0.0;

		if (expenseType.equals("MedicalExpense")) {
			if (expenseAmt <= 1000) {
				discount = expenseAmt * 0.15;
			} else if (expenseAmt > 1000 && expenseAmt <= 10000) {
				discount = expenseAmt * 0.2;
			} else if (expenseAmt > 10000) {
				discount = expenseAmt * 0.25;
			}
		}
		else if (expenseType.equals("TravelExpense")) {
			if (expenseAmt <= 1000) {
				discount = expenseAmt * 0.1;
			} else if (expenseAmt > 1000 && expenseAmt <= 10000) {
				discount = expenseAmt * 0.15;
			} else if (expenseAmt > 10000) {
				discount = expenseAmt * 0.2;
			}
		}
		else if (expenseType.equals("FoodExpense")) {
			if (expenseAmt <= 1000) {
				discount = expenseAmt * 0.05;
			} else if (expenseAmt > 1000 && expenseAmt <= 10000) {
				discount = expenseAmt * 0.1;
			} else if (expenseAmt > 10000) {
				discount = expenseAmt * 0.15;
			}
		}
		
		return discount;
	}

}
