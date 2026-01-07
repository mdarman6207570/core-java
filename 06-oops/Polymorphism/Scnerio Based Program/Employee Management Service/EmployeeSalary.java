package elc;

import java.util.Scanner;

import blc.FullTimeEmployee;
import blc.PartTimeEmployee;

public class EmployeeSalary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***Salary Calculation Menu***");
		System.out.println("1) FullTime Employees ");
		System.out.println("2) PartTime Employees ");
		
		System.out.println("Please select the Employee type");
		 int opt = Integer.parseInt(sc.nextLine());
		
		switch(opt) 
		{
		  case  1 ->
		    {
			   System.out.println("Enter Fulltime Employee Id :");
			   int id = Integer.parseInt(sc.nextLine());
			   System.out.println("Enter Fulltime Employee Name :");
			   String name = sc.nextLine();
			   System.out.println("Enter the Salary :");
			   double sallary = Double.parseDouble(sc.nextLine());
			   FullTimeEmployee full = new FullTimeEmployee(id, name, sallary);
			   System.out.println(full.getName()+" Salary is :"+full.calculateSalary());
	    	}
		
		  case 2 ->
		  {
			   System.out.println("Enter PartTime Employee Id :");
			   int id = Integer.parseInt(sc.nextLine());
			   System.out.println("Enter PartTime Employee Name :");
			   String name = sc.nextLine();
			   System.out.println("Enter your hourly rate:");
			   double hRate = Double.parseDouble(sc.nextLine());
			   System.out.println("Enter your total works hour in the month :");
			   int wHours = Integer.parseInt(sc.nextLine());
			   PartTimeEmployee part = new PartTimeEmployee(id, name, hRate, wHours);
			   System.out.println(part.getName()+" Salary is :"+part.calculateSalary());
		  }
		  default ->{
			  System.out.println("Choose option 1 OR 2");
			  System.exit(0);
		  }
		}
		sc.close();
	}

}
