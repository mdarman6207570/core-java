package day_56_Overriding__MCQ;

class A3 
{
public void printName()
{
System.out.println("Value-A");
}
}
class B3 extends A3
{
public void printName()
{
System.out.println("Name-B");
}
}
class C3 extends A3
{
public void printName()
{
System.out.println("Name-C");
}
}

public class Test29 
{
	public static void main (String[] args) {
		A3 b = new B3();
		C3 c = new C3();
		b = c;
		newPrint(b);
		}
		public static void newPrint(A3 a){
		a.printName();
		}
}
