package day_43__Static_Block;

class Student
{
	static
	{
		System.out.println("Static Block");
	}

	public Student() 
	{
		System.err.println("No Argument Constructor");
	}
	
	{
		System.out.println("Non Static Block");
	}
}



public class SBDemo2 
{
	public static void main(String[] args) 
	{ 
       System.out.println("Main Method"); 
	}
	
	static
	{
		System.out.println("static block of SBDemo2");
	}
}
