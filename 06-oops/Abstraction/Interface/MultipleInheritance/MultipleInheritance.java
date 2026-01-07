package day_58__Interface;

interface Alpha
{
	void m1();
}

interface Beta
{
	void m1();
}

class Implementer implements Alpha,Beta
{

	@Override
	public void m1() 
	{
		System.out.println("Multiple Inheritance is Possible");
	}
}

public class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		new Implementer().m1();
	}

}
