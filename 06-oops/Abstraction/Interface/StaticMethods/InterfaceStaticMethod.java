package day_60_Interface_Advance_Cocept;

interface Alpha3
{
	static void m1()
	{
		System.out.println("static method of interface Alpha");
	}
}

class Beta3 implements Alpha3
{
	
}

public class InterfaceStaticMethod 
{
	public static void main(String[] args) 
	{
		//Beta3.m1();          //Invalid
		
		//new Beta().m1();   //Invalid
		
		Alpha3.m1();
	}

}
