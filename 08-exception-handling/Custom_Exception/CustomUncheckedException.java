package custom_exception;

import java.util.Scanner;

class GreaterMarksException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	public GreaterMarksException()
	{
		
	}
	
	public GreaterMarksException(String errorMessage)
	{
		
	}
	
}


public class CustomUncheckedException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter you marks :");
			int marks = Integer.parseInt(sc.nextLine());
			validateMarks(marks);
		}
		catch(GreaterMarksException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Thank you 4 visiting my application");
	}

	
	
	public static void validateMarks(int marks)
	{
		if(marks>100)
		{
			throw new GreaterMarksException("Invalid Marks");
		}
		else
		{
			System.out.println("Your Marks is :"+marks);
		}
	}
}
