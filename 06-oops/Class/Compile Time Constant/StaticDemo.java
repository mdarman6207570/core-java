package day_44__Compile_Time_Constant;

class Test1
{
	static int x;   //valid
	
	//int x;  //Invalid

	public Test1(int x) 
	{
		this.x = x;
	}
	
	public static void access() 
	{
	System.out.println("x value is :"+x);	  
	}
	
}

public class StaticDemo 
{
	public static void main(String args[])
	{
		Test1 t = new Test1(10);
		Test1.access();
	}
}
