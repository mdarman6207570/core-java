package sunday_day_02__Objects_and_its_Methods;


import foo.Foo;

public class GetClassDemo2 
{
	public static void main(String[] args) 
	{
		Foo f = new Foo();
		System.out.println(f.getClass());
		
		System.out.println("========================");
		
		Integer i = 90;
		System.out.println(i.getClass());
		
		System.out.println("========================");
		
		String str = "India";
		System.out.println(str.getClass());
	}

}
