package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test15
{
	public void accept(int... s) 
	{
		System.out.println("var args");
	}
	public void accept(Integer i) 
	{
		System.out.println("Autoboxing");
	}
}

public class AmbiguityIssue15
{
	public static void main(String[] args) 
	{
		Test15 t = new Test15();
		t.accept(12);
		
	}
}
