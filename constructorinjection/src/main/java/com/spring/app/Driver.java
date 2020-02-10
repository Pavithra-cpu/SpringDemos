package com.spring.app;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
// 		Scanner sc=new Scanner(System.in);
// 		int cid,mid,visit;
// 		String name,email,mtype;
// 		long pno;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Customer customer = (Customer) ctx.getBean("custObj");
// 		System.out.println("Enter Customer ID:");
// 		cid=sc.nextInt();
// 		System.out.println("Enter Customer Name:");
// 		name=sc.next();
// 		name+=sc.nextLine();
// 		System.out.println("Enter Customer Email:");
// 		email=sc.nextLine();
// 		System.out.println("Enter Customer Mobile:");
// 		pno=sc.nextLong();
		
		
		MemberShip membership = (MemberShip) ctx.getBean("memObj");
// 		System.out.println("Enter Membership ID:");
// 		mid=sc.nextInt();
// 		System.out.println("Enter Membership Type:");
// 		mtype=sc.next();
// 		mtype+=sc.nextLine();
// 		System.out.println("Enter No of Visits per Year:");
// 		visit=sc.nextInt();
		
// 		membership.setMembershipId(mid);
// 		membership.setMembershipType(mtype);
// 		membership.setVisitsPerYear(visit);
//		membership.setCustomer(customer);
		
// 		membership.getCustomer().setCustId(cid);
// 		membership.getCustomer().setCustName(name);
// 		membership.getCustomer().setEmailId(email);
// 		membership.getCustomer().setContactNo(pno);
		
//		System.out.println("Customer ID: "+membership.getCustomer().getCustId());
//		System.out.println("Customer Name: "+membership.getCustomer().getCustName());
//		System.out.println("Customer Email Id: "+membership.getCustomer().getEmailId());
//		System.out.println("Customer Contact No: "+membership.getCustomer().getContactNo());
//		System.out.println("Membership ID: "+membership.getMembershipId());
//		System.out.println("Membership Type: "+membership.getMembershipType());
//		System.out.println("Visits Per Year: "+membership.getVisitsPerYear());
		
		System.out.println(membership);

	}

}
