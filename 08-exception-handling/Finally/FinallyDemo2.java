package day_70_Exception_handling_finally_block;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);
			System.out.println("Enter your Roll number :");
			int roll = sc.nextInt();
			System.out.println("Your roll number is :"+roll);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input is not in a proper format");
		}
		finally
		{
			System.out.println("Finally Block");
			sc.close();
		}
		System.out.println("Main method completed");
	}
}
