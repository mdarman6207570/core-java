package day_47_Overloading___Var_args;


class Sum
{
	public int  add(int x, int y)
	{
		return x+y;
	}
	
	public float add(float x, float y)
	{
		return x+y;
	}
	
	public String add(String x, String y)
	{
		return x+y;
	}
}
public class Overloadingdemo2 
{
	public static void main(String[] args) 
	{
		Sum sum = new Sum();
		System.out.println("Sum of two integer is :"+sum.add(12,12));
		System.out.println("Sum of two float is :"+sum.add(12.2F,12.9f));
		System.out.println("Sum of two String is :"+sum.add("Java", "Technology"));
    }
}
