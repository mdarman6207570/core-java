package lambda;

import java.util.function.BiPredicate;

public class Lambda11 
{
	public static void main(String[] args) 
	{
		BiPredicate<String, Integer> filter = (x,y) ->
		{
			return x.length() ==y;
		};
		
		boolean result = filter.test("Arman", 5);
		System.out.println(result);
		
		result = filter.test("hyderabad", 10);
		System.out.println(result);
	}

}
