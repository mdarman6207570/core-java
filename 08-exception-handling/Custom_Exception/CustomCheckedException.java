package custom_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception            //Checked Exception
{
	//backward compatibility
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException()
	{
		
	}
	
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}


public class CustomCheckedException 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
		   System.out.println("Enter your Age :");
		   int age = Integer.parseInt(sc.nextLine());
		   validateAge(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is Invalid");
		}
		else
		{
			System.out.println("Your Age is :"+age+" so, You can vote");
		}
	}
}
