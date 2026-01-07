package day_70_Exception_handling_finally_block;

public class FinallyDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			int x = 10/0;
			System.out.println("x value is :"+x);
		}
		finally
		{
			System.out.println("Finally Block");
			System.out.println("Guranteed for Execution");
		}
		System.out.println("Main method executed successfully!!!");
	}

}
