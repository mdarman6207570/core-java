package day_58__Interface;

abstract interface A
{
	void m1();
}

interface B extends A
{
	void m2();    //contains 2 abstract method
}

class Implementer2 implements B
{
	@Override
	public void m1() 
	{
		System.out.println("m1 method implemented");	
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 method implemented");
	}
}

public class InterfaceExtension 
{
	public static void main(String[] args) 
	{
		Implementer2 i = new Implementer2();
		i.m1();
		i.m2();
	}
}
