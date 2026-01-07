package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapToIntDemo1 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Rohit","Virat","Gill","Bumrah");
	    IntStream mapToInt = names.stream().mapToInt(str -> str.length());
	    mapToInt.forEach(System.out::println);
	}
}
