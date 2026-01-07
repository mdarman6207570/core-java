package sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDemo2 
{
	public static void main(String[] args) 
	{
		List<Integer> nums = Arrays.asList(5,2,8,1,3);
		
		nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
