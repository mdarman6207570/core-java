package basic_exception;

import java.util.Scanner;

public class ExceptionHandlingDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		handleExceptions(str);
	}

	public static void handleExceptions(String str)
	{
		try
		{
			int len = str.length();
			System.out.println("Length of the input string: "+len);
			
			int num = Integer.parseInt(str);
			System.out.println("Converted to integer: "+num);
		}
		catch(NumberFormatException | NullPointerException e)
		{
			if(e instanceof NumberFormatException)
			{
				System.out.println("Input is not a valid integer.");
			}
			else 
			{
				System.out.println("Input is null.");
			}
		}
	}
}
