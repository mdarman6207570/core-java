package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Alpha
{
	
}
class Beta extends Alpha
{
	
}
class Test12
{
	public void accept(Alpha s) 
	{
		System.out.println("Alpha");
	}
	public void accept(Beta b) 
	{
		System.out.println("Beta");
	}
}

public class AmbiguityIssue12
{
	public static void main(String[] args) 
	{
		Test12 t = new Test12();
		t.accept(null); 
	}
}
