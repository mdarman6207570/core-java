package innerclass;

class Outer
{
	private int a = 20;
	
	class Inner
	{
		public void displayValue()
		{
			System.out.println("Value of a is : "+a);
		}
	}
}

public class Test1 
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();  //Outer class Object
		
		Outer.Inner in = out.new Inner();   //Inner class Object
	    in.displayValue();
	}

}
