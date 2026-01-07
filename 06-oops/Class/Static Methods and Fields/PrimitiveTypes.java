package day_20_;

class Test
{
	static int x = 100;
	int y = 200;
	
	public void accept(int a) 
	{
		int b = 400;
		System.out.println("Class Variable :"+Test.x);
		System.out.println("Instance Variable :"+y);
		System.out.println("Parameter Variable :"+a);
		System.out.println("Local Variable :"+b);
	}
}

public class PrimitiveTypes 
{
	public static void main(String[] args) 
	{
		Test test = new Test();
		test.accept(300);
	}

}
