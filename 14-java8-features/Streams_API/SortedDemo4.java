package sorted;

import java.util.Arrays;
public class SortedDemo4 
{
	public static void main(String[] args) 
	{
		Integer[] arr = {10,56,34,90,15,78};
		
		Arrays.stream(arr).sorted((i1,i2) -> Integer.compare(i2,i1)).forEach(System.out::println);
	
		System.out.println("...........................");
		
		int []array = {10,20,30,40,50};
		
		Arrays.stream(array).boxed().sorted((i1,i2) -> Integer.compare(i2,i1)).forEach(System.out::println);
	}
}
