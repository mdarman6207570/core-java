package com.arman.variable_shadow;
//BLC
public class Employee {
   private int employeeId = 101;
   private String employeeName = "Scott";
   public static String organisationName = "IT Company";
   
   public void accept(String organisationName) {
	
	   int employeeId = 201;
	   String employeeName = "Raj";
	   
	   System.out.println("Id is :"+employeeId);
	   System.out.println("Name is :"+employeeName);
	   System.out.println("Organisation Name is :"+organisationName);
   }
}


