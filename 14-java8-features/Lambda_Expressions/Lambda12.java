package lambda;

import java.util.function.BiPredicate;

public class Lambda12
{
	public static void main(String[] args) 
	{
		//check sum of two no is even
		BiPredicate<Integer, Integer> isSumEven = (x,y) ->
		{
			return (x+y)%2 == 0;
		};
		
		boolean result = isSumEven.test(7, 5);
		System.out.println(result);
		
		result = isSumEven.test(11, 10);
		System.out.println(result);
	}

}
