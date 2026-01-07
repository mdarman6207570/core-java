package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test
{
	public void accept(double d) 
	{
		System.out.println("double");
	}
	public void accept(float f) 
	{
		System.out.println("float");
	}
}

public class AmbiguityIssue1 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(6);
	}
}
