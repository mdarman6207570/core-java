package day_72;

public class ExceptionPropagationWithChecked 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started!!!");
		try
		{
			m1();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Handled by main method");
		}
		System.out.println("Main method ended!!!");
	}
	
	public static void m1() throws ClassNotFoundException
	{
		System.out.println("m1 method started!!!");
		m2();
		System.out.println("m1 method ended!!!");
	}
	
	public static void m2() throws ClassNotFoundException
	{
		System.out.println("m2 method started!!!");
		
		Class.forName("oracle.jdbc.driver,OracleDriver1");
		
		System.out.println("m2 method ended!!!");
	}
}
