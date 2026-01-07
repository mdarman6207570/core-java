package day_43__Static_Block;

class Alpha
{
	{
		System.out.println("A");
	}
	
	public Alpha() 
	{
		System.out.println("B");
	}
	
	static
	{
		System.out.println("C");
	}
}

class Beta extends Alpha
{

	{
		System.out.println("D");
	}
	
	public Beta() 
	{
		System.out.println("E");
	}
	
	static
	{
		System.out.println("F");
	}
}

public class IQ 
{
	public static void main(String[] args) 
	{
	   new Beta();
	}
}
