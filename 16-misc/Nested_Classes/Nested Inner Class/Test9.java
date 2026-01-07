package non_static_inner_class;

class Outer1
{
	private int x = 200;
	
	class InnerClass
	{
		public void display()               //Inner class display method
		{
			System.out.println("Inner class display method");
		}
		
		public void getValue()  
		{
			System.out.println("Can access outer private var :"+x);
		}
	}
	
	public void display()               //Outer class display method
	{
		System.out.println("Outer class display method");
	}
}

public class Test9 
{
	public static void main(String[] args) 
	{
		Outer1.InnerClass in = new Outer1().new InnerClass();
		in.getValue();
		in.display();
		
		new Outer1().display();
	}
}
