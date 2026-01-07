package day_56_Overriding__MCQ;

class A8 
{
public void printName()
{
System.out.println("Name-A");
}
}
class B8 extends A8
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

public class Test42 
{
	public static void main (String[] args)
	{
	A8 a = new A8();
	B8 b = (B8)a;
	b.printName();
	}
}
