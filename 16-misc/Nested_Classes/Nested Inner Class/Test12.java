package static_nested_class;

class Outer
{
	static int x = 15;
	static class Inner
	{
		public void msg()
		{
			System.out.println("x value is :"+x);
		}
	}
}


public class Test12
{

	public static void main(String[] args) 
	{
	   
		Outer.Inner in = new Outer.Inner();
	    in.msg();
	}

}