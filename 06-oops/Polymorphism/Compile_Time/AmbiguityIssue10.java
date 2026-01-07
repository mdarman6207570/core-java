package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test10
{
	public void accept(Object s) 
	{
		System.out.println("Object");
	}
	public void accept(String s) 
	{
		System.out.println("String");
	}
}

public class AmbiguityIssue10
{
	public static void main(String[] args) 
	{
		Test10 t = new Test10();
		t.accept("NIT");
	}
}
