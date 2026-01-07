package day_56_Overriding__MCQ;

class A9 
{
public void printName() 
{
System.out.println("Name-A");
}
}
class B9 extends A9
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

public class Test43 
{
	public static void main (String[] args){
		B9 b = new B9();
		A9 a = (A9)b;
		a.printName();
		}
}
