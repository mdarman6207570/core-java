package static_nested_class;

class OuterTest
{
	static int x = 25;
	static class Inner
	{
		static void msg()
		{
			System.out.println("x value is :"+x);
		}
	}
}


public class Test13
{

	public static void main(String[] args) 
	{
	   
		OuterTest.Inner.msg();
	}

}