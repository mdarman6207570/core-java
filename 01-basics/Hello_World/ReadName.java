package day_15_Taking_Input_From_User;

import java.util.Scanner;

public class ReadName 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name = sc.nextLine();
		System.out.println("Your name is :"+name);
		
		sc.close();
	}

}
