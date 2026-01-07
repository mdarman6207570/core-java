package flatmap_int_long_double;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapToIntDemo 
{
	public static void main(String[] args) 
	{
		int []a1 = new int[] {1,2,3};
		int []a2 = new int[] {4,5,6};
		int []a3 = new int[] {7,8,9};
		
		List<int[]> nestedArray = Arrays.asList(a1,a2,a3);
		
		int []arr = nestedArray.stream().flatMapToInt(ar -> IntStream.of(ar)).toArray();
		System.out.println(Arrays.toString(arr));
	}

}
