package day_43__Static_Block;

class Foo
{
	static int x;

	static
	{
		x = 100;
		System.out.println(x);
	}
	static
	{
		x = 200;
		System.out.println(x);
	}
	static
	{
		x = 300;
		System.out.println(x);
	}
}




public class SBDemo4 
{
	public static void main(String[] args) 
	{ 
      new Foo();
	}
}
