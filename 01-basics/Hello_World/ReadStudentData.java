package day_15_Taking_Input_From_User;

import java.util.Scanner;

public class ReadStudentData 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Student Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Student name :");
		String name = sc.nextLine();  //Buffer Problem
		name =sc.nextLine();
		
		System.out.println("Student Id  is :"+id);
		System.out.println("Student Name  is :"+name);
		
		sc.close();
	}
}
