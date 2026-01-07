package day_45_Class_Loading;

class Sample
{
	static
	{
		System.out.println("Static Block Of Sample class");
	}
}

public class DynamicClassLoading 
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("Sample"); //will load Sample.class file at runtime
	}
}
