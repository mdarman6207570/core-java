package day_52_Method_Overriding_Polymorphism;

class Super
{
	private void m1() 
	{
		System.out.println("Super class private method");
	}
}
class Sub extends Super
{
	public void m1()   //Re-decearation of method
	{
	System.out.println("Sub class public method");
	}
}
public class Overridingdemo5 {
	public static void main(String[] args) 
	{
	  Super s1 = new Sub();
	  //s1.m1();    //cannot access private method
	}
}
