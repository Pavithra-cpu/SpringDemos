package com.service;

import org.springframework.stereotype.Service;



import com.model.UserClaim;



// Using the service annotation to describe it to spring as a service

@Service

public interface TaxService {



 public double calculateTax(UserClaim userClaim);



}