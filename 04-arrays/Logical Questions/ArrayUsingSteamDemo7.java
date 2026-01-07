package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo7 
{
	public static void main(String[] args) 
	{
		 Integer[] numbers = {10, 20, 30, 40, 50};
       
		List<String> str = Arrays.stream(numbers).map(n -> "Number: "+n).collect(Collectors.toList());
	    System.out.println("Converted Strings : "+str);
	}
}
