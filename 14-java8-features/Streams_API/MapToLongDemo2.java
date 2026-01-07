package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class MapToLongDemo2 
{
	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList("Java","James","Gosling");
		
		LongStream lengths = words.stream().mapToLong(String::length);
		lengths.forEach(System.out::println);
	}
}
