package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test17
{
	public void accept(int x, long y) 
	{
		System.out.println("int -long");
	}
	public void accept(long x, int y) 
	{
		System.out.println("long-int");
	}
}

public class AmbiguityIssue17
{
	public static void main(String[] args) 
	{
		Test17 t = new Test17();
		//t.accept(9,1);  //error
		
	}
}
