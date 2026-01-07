package day_14__Char_Literal__String_Literal__Local_Variable;

public class MethodExecutionFlow 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method started!!");
		m1();
		System.out.println("Main Method Ended!!");
		
	}
	
	public static void m1()
	{
		System.out.println("M1 Method started!!");
		m2();
		System.out.println("M2 Method Ended!!");
		
	}
	public static void m2()
	{
		System.out.println("M2 Method started!!");
		int x = 900;
		System.out.println("x value is :"+x);
	}

}
