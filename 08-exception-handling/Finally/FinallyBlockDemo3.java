package day_70_Exception_handling_finally_block;

public class FinallyBlockDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started!!!");
		try
		{
			System.out.println("Inside try");
			int x = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch");
			System.err.println("Divide by zero problem");
		}
		finally
		{
			System.out.println("Inside Finally");
		}
		System.out.println("Main method ended!!!");
	}

}
