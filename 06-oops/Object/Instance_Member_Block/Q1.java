package day35.Constructor_Advance;

 
	class Test 
	{
	Test()
	{
	System.out.println("Constructor");
	}

	{
	System.out.println("Non-static block");
	}
	}
	
	public class Q1
	{
	public static void main(String[] args) 
	{
	System.out.println("main method");
	new Test();
	}
	}

   