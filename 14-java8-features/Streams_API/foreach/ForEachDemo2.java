package foreach;

import java.util.stream.Stream;

public class ForEachDemo2 
{
	public static void main(String[] args) 
	{
		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
		numbers.forEach(System.out::println);
	}
}
