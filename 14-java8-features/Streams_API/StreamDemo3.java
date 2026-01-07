package stream;

import java.util.Arrays;

public class StreamDemo3 
{
	public static void main(String[] args) 
	{
		int [] arr = {9, 8, 7, 5, 3, 2, 1};
		Arrays.stream(arr).sorted().forEach(System.out::println);;
	}
}
