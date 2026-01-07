package day_43__Static_Block;

class Test
{
	{
		System.out.println("Non Static block");
	}
	
	static
	{
		System.out.println("static block");
	}
}


public class SBDemo1 
{
	public static void main(String[] args) 
	{
       new Test();
       System.out.println(".......");
       new Test();
       System.out.println("........");
       new Test();
	}

}
