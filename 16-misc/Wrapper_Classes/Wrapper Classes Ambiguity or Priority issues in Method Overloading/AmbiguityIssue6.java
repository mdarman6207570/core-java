package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test6
{
	public void accept(double ...ds) 
	{
		System.out.println("double");
	}
	public void accept(long ...d) 
	{
		System.out.println("long");
	}
}

public class AmbiguityIssue6
{
	public static void main(String[] args) 
	{
		Test6 t = new Test6();
		t.accept();     
	}
}
