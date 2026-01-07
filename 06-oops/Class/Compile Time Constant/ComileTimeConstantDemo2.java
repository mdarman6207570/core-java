package day_44__Compile_Time_Constant;

class Sample2
{
	public static final int MAX_VALUE = m1();
	
	public static int m1()
	{
		return 500;
	}
	
	static
	{
		System.out.println("Sample class static block");
	}
}

public class ComileTimeConstantDemo2 
{
	public static void main(String[] args) 
	{ 
		System.out.println(Sample2.MAX_VALUE);  //.class will be loaded 
	}
}
