package find_any__find_first__match;

import java.util.Arrays;

public class FindFirstDemo2 
{
	public static void main(String[] args) 
	{
		Integer arr[] = {10,20,50,90,70,40,70,90};
		
		//2nd highest element
		
		Arrays.stream(arr).distinct().sorted((i1,i2) -> i2.compareTo(i1)).skip(1).findFirst().ifPresent(System.out::println);
	}
}
