package find_any__find_first__match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NoneMatchDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> number = Arrays.asList(1,3,5,7,9);
		
		Predicate<Integer> isEven = n -> n%2==0;
		boolean nonEven = number.stream().noneMatch(isEven);
		
		if(nonEven)
		{
			System.out.println("There are no even numbers");
		}
		else
		{
			System.out.println("There is atleast one even number ");
		}
	}
}
