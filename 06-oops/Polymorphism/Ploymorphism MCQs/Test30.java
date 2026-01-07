package day_56_Overriding__MCQ;

class A4 
{
public void printName()
{
System.out.println("Value-A");
}
}
class B4 extends A4
{
public void printName()
{
System.out.println("Name-B");
}
}
class C4 extends A4
{
public void printName()
{
System.out.println("Name-C");
}
}
public class Test30 
{
	public static void main (String[] args) 
	{
	B4 b = new B4();
	C4 c = new C4();
	//b = c;
	newPrint(b);
	}
	public static void newPrint(A4 a)
	{
	a.printName();
	 }
}
