package day12.elc;

import java.util.Scanner;

import day12.blc.Employee;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int EmployeeId =Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee name");
		String EmployeeName =sc.nextLine();
		
		System.out.println("Enter Employee Sallary");
		double EmployeeSallary = Double.parseDouble(sc.nextLine());
			
		
		employee.setEmployeeData(EmployeeId,EmployeeName,EmployeeSallary);
		employee.getEmployeeInfo();
		sc.close();
	}

}
