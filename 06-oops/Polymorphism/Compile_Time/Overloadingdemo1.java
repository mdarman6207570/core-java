package day_47_Overloading___Var_args;

//Program on Constructor Overloading


class Addition
{
	public Addition(int x, int y)
	{
		this(2.3F,7.8f);
		System.out.println("Sum of two integer is :"+(x+y));
	}
	
	public Addition(float x, float y)
	{
		this("Data","base");
		System.out.println("Sum of two float is :"+(x+y));
	}
	
	public Addition(String x, String y)
	{
		super();
		System.out.println("Sum of two String is :"+(x+y));
	}
}

public class Overloadingdemo1 
{
	public static void main(String[] args) 
	{
		new Addition(100,200);
	}

}
