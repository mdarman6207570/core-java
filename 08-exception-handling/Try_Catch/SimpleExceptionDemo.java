package basic_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter no a :");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter no b :");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("You entered a = "+a +" and b = "+b);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();;
		}
		
		System.out.println("#############################################");
	}

}
