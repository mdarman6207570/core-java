package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test9
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

public class AmbiguityIssue9
{
	public static void main(String[] args) 
	{
		Test9 t = new Test9();
		t.accept(9D);
	}
}
