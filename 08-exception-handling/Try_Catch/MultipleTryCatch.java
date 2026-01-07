package day_69_Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method started!!!");
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your salary :");
			double sal = sc.nextDouble();
			System.out.println("Your salary is :"+sal);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input is not in a valid format");
		}
		
		try
		{
			int size = -9;
			int []arr = new int[size];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Array size must be a positive integer!!!");
		}
	}

}
