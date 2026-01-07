package lambda;

import java.util.function.BinaryOperator;

public class Lambda16 
{
	public static void main(String[] args) 
	{
		BinaryOperator<Integer> add = (a,b) -> a+b;
		System.out.println(add.apply(3, 5));
	}
}
