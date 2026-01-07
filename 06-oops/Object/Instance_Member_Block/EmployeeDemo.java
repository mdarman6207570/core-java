package com.arman.elc;

import com.arman.blc.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		System.out.println("-------Employee Details 1 :---------");
		Employee asad = new Employee();
		asad.setEmployeeDetails(121, "Asad", 65000);
		asad.getEmployeeDetails();
		asad.calculateSalaryIncrement();
		
		System.out.println();
		System.out.println("-------Employee Details 2 :---------");
		Employee mksd = new Employee();
		mksd.setEmployeeDetails(122, "mksd", 75000);
		mksd.getEmployeeDetails();
		mksd.calculateSalaryIncrement();
		
		System.out.println();
		System.out.println("----------Employee Details 3 :----------");
		Employee aaru = new Employee();
		aaru.setEmployeeDetails(123, "Arman", 55000);
		aaru.getEmployeeDetails();
		aaru.calculateSalaryIncrement();

	}
}
