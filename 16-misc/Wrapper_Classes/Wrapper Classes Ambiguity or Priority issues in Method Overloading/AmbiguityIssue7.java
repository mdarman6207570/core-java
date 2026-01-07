package day_50_Compile_Time_Polymorphism_Method_Overloading;

class Test7
{
	public void accept(byte d) 
	{
		System.out.println("byte");
	}
	public void accept(short s) 
	{
		System.out.println("short");
	}
}

public class AmbiguityIssue7
{
	public static void main(String[] args) 
	{
		Test7 t = new Test7();
		// t.accept(9);  //error
		t.accept((byte)9);
		t.accept((short)9);
	}
}
