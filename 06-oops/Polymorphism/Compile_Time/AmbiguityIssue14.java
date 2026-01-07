package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test14
{
	public void accept(long s) 
	{
		System.out.println("widening");
	}
	public void accept(Integer i) 
	{
		System.out.println("Autoboxing");
	}
}

public class AmbiguityIssue14
{
	public static void main(String[] args) 
	{
		Test14 t = new Test14();
		t.accept(12);
		
	}
}
