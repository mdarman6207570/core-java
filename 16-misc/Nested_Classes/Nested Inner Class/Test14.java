package static_nested_class;

class OuterDemo
{
	int x = 15;
	static class Inner
	{
		void msg()
		{
			//System.out.println("x value is "+x);    //Cannot make a static reference to the non-static field x
		}
	}
}
public class Test14 
{
	OuterDemo.Inner in = new OuterDemo.Inner();
	//in.msg();
}
