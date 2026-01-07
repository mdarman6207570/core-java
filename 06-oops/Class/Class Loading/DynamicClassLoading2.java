package day_45_Class_Loading;

class Sample2
{
	static
	{
		System.out.println("Static Block Of Sample class");
	}
}


public class DynamicClassLoading2 
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("Employee"); //exception ->   java.lang.ClassNotFoundException
	}
}
