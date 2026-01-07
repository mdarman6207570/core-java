package day_60_Interface_Advance_Cocept;

interface Alpha
{
	default void m1()
	{
		System.out.println("m1 default method of Alpha interface");
	}
}

class Beta 
{
	public void m1()
	{
		System.out.println("m1 concrete method of Beta class");
	}
}

class Gamma extends Beta implements Alpha
{
	
}

public class Priority 
{
	public static void main(String[] args) 
	{
		new Gamma().m1();
	}

}
