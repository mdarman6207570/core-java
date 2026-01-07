package day_60_Interface_Advance_Cocept;

interface A
{
	default void m1()
	{
		System.out.println("default method of interface A");
	}
}

interface B
{
	default void m1()
	{
		System.out.println("default method of interface B");
	}
}

class Implementer implements A,B
{

	@Override
	public void m1() 
	{
		System.out.println("Mi is possible");
	    A.super.m1();
	    B.super.m1();
	}
	
}

public class MultipleInheritanceUsingDefaultMethod 
{
	public static void main(String[] args) 
	{
		new Implementer().m1();;
	}

}
