package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo3 
{
	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList("Java","is","Best");
		
		Optional<String> concatane = words.stream().reduce((a,b)->a+" "+b);
		concatane.ifPresent(System.out::println);
	}
}
