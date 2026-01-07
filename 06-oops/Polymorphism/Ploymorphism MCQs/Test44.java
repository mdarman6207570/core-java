package day_56_Overriding__MCQ;

class A10
{
public void printName()
{
System.out.println("Name-A");
}
}
class B10 extends A10
{
/*
public String printName()
{
System.out.println("Name-B");
return null;
}
*/
}

public class Test44 
{
	public static void main (String[] args)
	{
	A10 a = new B10();
	a.printName();
	}
}
