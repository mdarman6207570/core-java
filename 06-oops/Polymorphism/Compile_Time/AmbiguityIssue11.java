package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test11
{
	public void accept(Object s) 
	{
		System.out.println("Object");
	}
	public void accept(String s) 
	{
		System.out.println("String");
	}
	public void accept(Integer s) 
	{
		System.out.println("Integer");
	}
}

public class AmbiguityIssue11
{
	public static void main(String[] args) 
	{
		Test11 t = new Test11();
		//t.accept(null);  //error
	}
}
