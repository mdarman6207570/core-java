package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test13
{
	public void accept(Number s) 
	{
		System.out.println("Number");
	}
	public void accept(Integer i) 
	{
		System.out.println("Integer");
	}
}

public class AmbiguityIssue13
{
	public static void main(String[] args) 
	{
		Test13 t = new Test13();
		t.accept(12);
		
	}
}
