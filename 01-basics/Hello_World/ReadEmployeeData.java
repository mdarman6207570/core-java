package day_15_Taking_Input_From_User;

import java.util.Scanner;

public class ReadEmployeeData 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Employee Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee name :");
		String name = sc.nextLine();
		
		System.out.println("Employee Id  is :"+id);
		System.out.println("Employee Name  is :"+name);
		
		sc.close();
	}
}
