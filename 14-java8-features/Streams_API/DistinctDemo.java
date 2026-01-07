package stream_methods;

import java.util.Arrays;

public class DistinctDemo 
{
	public static void main(String[] args) 
	{
		int []arr = {10,20,10,20,30,40,50};
		
		Arrays.stream(arr).distinct().sorted().forEach(System.out::println);
	}
}
