package com.encapsulation;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee scott = new Employee(101, "Mr Scott", 65000);
		System.out.println(scott);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Increment Amount :");
		int amount = Integer.parseInt(sc.nextLine());
		
		scott.setEmployeeSalary(scott.getEmployeeSalary() + amount);
        System.out.println(scott);
        
        sc.close();
	}

}
