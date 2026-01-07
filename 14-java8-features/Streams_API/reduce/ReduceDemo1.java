package reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo1 
{
	public static void main(String[] args) 
	{
		Stream<Integer> intSum = Stream.of(1,2,3,4,5);
		Optional<Integer> reduce = intSum.reduce(Integer::sum);
		
		reduce.ifPresent(System.out::println);
		
		System.out.println("....................................");
		
		 intSum = Stream.of(1,2,3,4,5);
		 Integer sumWithIdentity = intSum.reduce(2, Integer::max);
		
		System.out.println(sumWithIdentity);
	}
}
