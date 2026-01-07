package day_15_Taking_Input_From_User;

import java.util.Scanner;

public class ReagGender 
{
	public static void main(String args[])
	{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Gender [Male/Female] :");
	char gender = sc.next().charAt(0);
	System.out.println("Your Gender is :"+gender);
	
	sc.close();

	}
}