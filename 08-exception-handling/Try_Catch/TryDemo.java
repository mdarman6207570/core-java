package day_68_Exception_handling_keyword;

import java.util.Scanner;

public class TryDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		
		try
		{
			System.out.println("Enter the value of x :");
			int x = sc.nextInt();
			System.out.println("Enter the value of y :");
			int y = sc.nextInt();
			
			int result = x/y;
			System.out.println("Result is :"+result);
			System.out.println("End of try!!!");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch!!!");
			System.err.println(e);
		}
		System.out.println("Thank you for Visiting!!!");
		sc.close();
	}

}
