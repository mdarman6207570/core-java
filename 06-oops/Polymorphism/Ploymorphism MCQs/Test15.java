package mcq;

class A15 
{
void foo() 
{
System.out.println("A");
}
}

class B15 extends A15 
{
void foo() 
{
System.out.println("B");
}
}	


public class Test15 
{
	public static void main(String[] args)
	{
	A15 obja;
	B15 objb = new B15();
	objb.foo();
	obja = objb;
	obja.foo();
	}
}
