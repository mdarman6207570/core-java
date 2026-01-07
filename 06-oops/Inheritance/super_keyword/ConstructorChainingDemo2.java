package Constructor___Chaining;

class A
{
	A()
	{
		System.out.println("A");
	}
}

class B extends A
{
}

class C extends B
{
	C()
	{
		System.out.println("C");
	}
}

public class ConstructorChainingDemo2 
{

	public static void main(String[] args) 
	{
	  new C();	
	}

}
