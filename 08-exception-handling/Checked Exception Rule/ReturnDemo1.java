package day_73;

public class ReturnDemo1 
{	
	public static void main(String[] args) 
	{
		System.out.println(m1());
	}
	public static int m1()
	{
		try 
		{
			System.out.println("Inside try");
			return 10;
		} 
		
		catch (Exception e) 
		{
		  	System.out.println("Inside catch");
		  	return 20;
		}
		//System.out.println("Unreachable!!!");
	}
}
