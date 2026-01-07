package day_56_Overriding__MCQ;

class A7
{
public void printName()
{
System.out.println("Name-A");
}
}
class B7 extends A7
{
public void printName()
{
System.out.println("Name-B");
}
public void printValue()
{
System.out.println("Value-B");
}
}

public class Test41 
{
	public static void main (String[] args)
	{
	A7 b = new B7();
//	b.printValue();               cannot call type is A
	}
}

