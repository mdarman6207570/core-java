package _Method_Overriding__Co_Varient;

class Base 
{
	int x = 100;
}

class Derived extends Base
{
	int x = 200;      //Variable Hiding
	
	public static void access() 
	{
		Derived derived = new Derived();
		System.out.println(derived.x);
		
		Base base = derived;
		System.out.println(base.x);
	}
}

public class IQ2 
{
	public static void main(String[] args) 
	{
		Derived.access();
	}

}
