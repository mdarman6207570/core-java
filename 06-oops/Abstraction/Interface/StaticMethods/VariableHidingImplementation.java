package day_60_Interface_Advance_Cocept;

interface I
{
	int x = 100;
}

abstract class J
{
	int x = 200;
}

class C extends J implements I
{
	int x = 300;      //Variable Hiding
	
	public void m1()
	{
		System.out.println(x);
	}
}

public class VariableHidingImplementation 
{
	public static void main(String[] args) 
	{
		new C().m1();
	}

}
