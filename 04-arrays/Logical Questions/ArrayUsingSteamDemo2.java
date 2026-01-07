package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo2 
{
	public static void main(String[] args) 
	{
		String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
       
		List<String> namesWithA = Arrays.stream(names).filter(name -> name.contains("a") || name.contains("A")).collect(Collectors.toList());
	     System.out.println("Names Containing 'A' or 'a' : "+namesWithA);
	}
}
