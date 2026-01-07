package day_43__Static_Block;


class Demo
{
	static int x;
	
	static
	{
		System.out.println("default value :"+x);
		x=900;
	}
}


public class SBDemo3 
{
	public static void main(String[] args) 
	{ 
       System.out.println("user Value"+Demo.x); 
	}
}
