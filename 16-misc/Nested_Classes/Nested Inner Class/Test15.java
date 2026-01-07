package static_nested_class;

class Outer1
{
	private String x = "Outer class private data";
	
	public void doSttuff()
	{
		String z = "local variable";   //final or effectively final
		
		class MyInner       //Only final and abstract applicable
		{
			public void seeOuter()
			{
				System.out.println("Outer x is "+x);
				System.out.println("Outer x is "+z);
			}
		}
		MyInner mi = new MyInner();
		mi.seeOuter();
	}
}

public class Test15 
{
	public static void main(String[] args) 
	{
		Outer1 out = new Outer1();
		out.doSttuff();
	}
}
