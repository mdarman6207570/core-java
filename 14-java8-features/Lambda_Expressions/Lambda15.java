package lambda;

import java.util.function.UnaryOperator;

public class Lambda15 
{
	public static void main(String[] args) 
	{
		UnaryOperator<Integer> square = x -> x*x;
		System.out.println(square.apply(10));
		

		UnaryOperator<String> concat = str -> str.concat("base");
		System.out.println(concat.apply("Data"));
	}

}
