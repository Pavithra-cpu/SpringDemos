package com.sample.service;



import org.springframework.context.annotation.Configuration;

import com.sample.model.HelperBean;

@Configuration

public class HelperService {



 // calculate the totalCost and return the cost

 public double calculateTotalCost(HelperBean helperBean) {

 int costACService = 400;

 int costWashingMachineService = 500;

 int costRefrigeratorService = 300;

 int hours = helperBean.getNoOfHours();

 String serviceType = helperBean.getServiceType();

 double totalCost = 0;

 if (serviceType.equals("ACService"))

  totalCost = totalCost + (costACService * hours);

 else if (serviceType.equals("WashingMachineService"))

  totalCost = totalCost + (costWashingMachineService * hours);

 else if (serviceType.equals("RefrigeratorService"))

  totalCost = totalCost + (costRefrigeratorService * hours);

 return totalCost;



 }



}
