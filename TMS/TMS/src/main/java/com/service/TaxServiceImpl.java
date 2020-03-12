package com.service;



import org.springframework.stereotype.Component;



import com.model.UserClaim;



@Component

public class TaxServiceImpl implements TaxService {



 @Override

 public double calculateTax(UserClaim userClaim) {



 // Implementing the business logic

 String expenseType = userClaim.getExpenseType();

 double expenseAmount = userClaim.getExpenseAmt();

 int tax = 0;

 double taxClaimAmount;



 if (expenseType.equals("MedicalExpense")) {



  if (expenseAmount <= 1000) {

  tax = 15;

  } else if (expenseAmount > 1000 && expenseAmount <= 10000) {

  tax = 20;

  } else

  tax = 25;



 } else if (expenseType.equals("TravelExpense")) {

  if (expenseAmount <= 1000) {

  tax = 10;

  } else if (expenseAmount > 1000 && expenseAmount <= 10000) {

  tax = 15;

  } else

  tax = 20;

 } else {

  if (expenseAmount <= 1000) {

  tax = 5;

  } else if (expenseAmount > 1000 && expenseAmount <= 10000) {

  tax = 10;

  } else

  tax = 15;

 }



 taxClaimAmount = expenseAmount * tax / 100;

 return taxClaimAmount;

 }

}

