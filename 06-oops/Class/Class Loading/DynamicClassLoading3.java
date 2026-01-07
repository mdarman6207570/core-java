package day_45_Class_Loading;

class Demo
{
	static
	{
		System.out.println("Static Block Of Demo class");
	}
}

public class DynamicClassLoading3 
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("day_45_Class_Loading.Demo"); //Here FQN (package name + class name)
	}
}
