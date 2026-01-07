package day_61_Functional_Programming_Lambda_Expression;

@FunctionalInterface
interface Calculator
{
	void doSum(int x, int y);
}

public class LambdaDemo2
{
	public static void main(String[] args) 
	{
		Calculator c1 = (c,d)-> System.out.println("Sum is :"+(c+d));
		c1.doSum(10,20);
		
	}
}
