package stream;

import java.util.Arrays;
import java.util.List;

public class MapToDoubleDemo2 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(4,9,16,25);
		numbers.stream().mapToDouble(n -> Math.sqrt(n)).forEach(System.out::println);
	}
}
