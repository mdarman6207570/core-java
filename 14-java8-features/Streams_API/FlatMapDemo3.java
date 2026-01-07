package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo3 
{
	public static void main(String[] args) 
	{
		List<String> listOfNames = Arrays.asList("Jaya","Aryan","Virat","Aakash");
	
		
		List<Character> flatMap = listOfNames.stream().flatMap(str -> Stream.of(str.charAt(0))).toList();
		System.out.println(flatMap);
	}

}
