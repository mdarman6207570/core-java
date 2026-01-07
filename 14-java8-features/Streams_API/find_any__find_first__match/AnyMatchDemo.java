package find_any__find_first__match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchDemo 
{
	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Virat","Rohit","Bumrah","Surya");
		
		boolean startwithA = listOfName.stream().anyMatch(name -> name.startsWith("A"));
		System.out.println("Any name starts with A :"+startwithA);
		
		System.out.println("================================");
		
		List<Integer> number = Arrays.asList(1,3,5,7,8);
		
		Predicate<Integer> isEven = n -> n%2==0;
		boolean anyEven = number.stream().anyMatch(isEven);
		
		if(anyEven)
		{
			System.out.println("There is atleast one even number ");
		}
		else
		{
			System.out.println("There are no even numbers");
		}
	}
}
