package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test2
{
	public void accept(int d) 
	{
		System.out.println("int");
	}
	public void accept(char d) 
	{
		System.out.println("char");
	}
}

public class AmbiguityIssue2 
{
	public static void main(String[] args) 
	{
		Test2 t = new Test2();
		t.accept(6);
	}
}
