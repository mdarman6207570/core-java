package sorted;

import java.util.Arrays;
import java.util.List;

public class SortedDemo1 
{
	public static void main(String[] args) 
	{
		List<Integer> nums = Arrays.asList(5,2,8,1,3);
		
		nums.stream().sorted().forEach(System.out::println);
	}
}
