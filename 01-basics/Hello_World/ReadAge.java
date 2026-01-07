package day_15_Taking_Input_From_User;

import java.util.Scanner;

public class ReadAge 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();
		System.out.println("Your Age is:"+age);
		sc.close();
	}

}
