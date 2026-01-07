package intstream_doublestream_demo;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamMethods1 
{
	public static void main(String[] args) 
	{
		IntStream.range(11,20).forEach(System.out::println);
		
		int[] arr = {10,20,30,40,50};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum of all the Array Elements :"+sum);
	    
		System.out.println("Minimum Elemnt is :");
		IntStream stream = Arrays.stream(arr);
		OptionalInt min = stream.min();
		min.ifPresent(System.out::println);
		
		System.out.println("Maximum Element is :");
		Arrays.stream(arr).max().ifPresent(System.out::println);
		
		System.out.println("Average Element is :");
		Arrays.stream(arr).average().ifPresent(System.out::println);
		
		long count = Arrays.stream(arr).count();
		System.out.println("Total Numbers of Elements :"+count);
		
		
	}
}
