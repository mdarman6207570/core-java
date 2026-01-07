package day_73;

public class ReturnDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println(m1());
	}
	@SuppressWarnings("finally")
	public static int m1()
	{
		try 
		{
			System.out.println("Inside try");
			return 10/0;
		} 
		
		catch (Exception e) 
		{
		  	System.out.println("Inside catch");
		  	return 20;
		}
		
		finally 
		{
			System.out.println("Inside finally");
			return 30;
		}
	}
}
