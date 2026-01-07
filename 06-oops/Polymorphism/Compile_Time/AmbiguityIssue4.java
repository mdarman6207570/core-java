package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test4
{
	public void accept(short... d) 
	{
		System.out.println("short");
	}
	public void accept(char ...d) 
	{
		System.out.println("char");
	}
}

public class AmbiguityIssue4
{
	public static void main(String[] args) 
	{
		Test4 t = new Test4();
	//	t.accept();    //error 
	}
}
