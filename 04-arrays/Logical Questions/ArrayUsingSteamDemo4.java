package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo4
{
	public static void main(String[] args) 
	{
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		
		List<String> names = Arrays.stream(words).filter(name -> name.length()>3).collect(Collectors.toList());
	    System.out.println(names);
	}
}
