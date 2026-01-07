package innerclass;

class FooOuter
{
	int x = 15;
	
	{
		System.out.println("Outer class non static block");
	}
	
	class Inner
	{
		{
			System.out.println("Inner class non static block");
		}
		
		public void m1()
		{
			System.out.println("m1 static method :"+x);
		}
	}
}

public class Example1 
{
	public static void main(String[] args) 
	{
		FooOuter foo = new FooOuter();  //Outer class Object
		
		FooOuter.Inner in = foo.new Inner();   //Inner class Object
	    in.m1();
	}

}
