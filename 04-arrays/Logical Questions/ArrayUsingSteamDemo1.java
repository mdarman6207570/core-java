package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo1 
{
	public static void main(String[] args) 
	{
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
       
		List<Integer> positivearr = Arrays.stream(numbers).filter(num -> num>0).collect(Collectors.toList());
	     System.out.println("Positive Numbers : "+positivearr);
	}
}
