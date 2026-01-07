package day_60_Interface_Advance_Cocept;

class Alpha2
{
	public static void m1() 
	{
		System.out.println("Static Method of Alpha class");
	}
}

class Beta2 extends Alpha2
{
	
}

public class ClassStaticMethod 
{
	public static void main(String[] args) 
	{
		Beta2.m1();
		System.out.println("...........");
		
		new Beta2().m1();
	}
}


