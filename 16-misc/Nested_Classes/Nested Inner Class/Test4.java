package innerclass;

class MyOuter4
{
	static int x =7;
	
	class MyInner
	{
		public static void seeOuter()   //MyInner.seeOuter()
		{
			System.out.println("Outer x is "+x);
		}
	}
}

public class Test4 
{
	public static void main(String[] args) 
	{
		MyOuter4.MyInner.seeOuter();
	}

}
