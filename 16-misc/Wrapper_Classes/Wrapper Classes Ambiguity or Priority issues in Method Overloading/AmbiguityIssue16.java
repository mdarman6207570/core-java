package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test16
{
	public void accept(Number n) 
	{
		System.out.println("Number");
	}
	public void accept(Double d) 
	{
		System.out.println("Double");
	}
}

public class AmbiguityIssue16
{
	public static void main(String[] args) 
	{
		Test16 t = new Test16();
		t.accept(12);
		
	}
}
