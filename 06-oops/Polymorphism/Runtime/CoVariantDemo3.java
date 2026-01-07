package _Method_Overriding__Co_Varient;

import java.util.Scanner;

class Super
{
	public Object m1() 
	{
		System.out.println("M1 method of Super Class");
		return new Object();
	}
}

class Sub extends Super
{
	public Scanner m1() 
	{
		System.out.println("M1 method of Sub class");
		return null;
	}
}

public class CoVariantDemo3 
{
	public static void main(String[] args) 
	{
		Super s1 = new Sub();
		s1.m1();
	}
}
