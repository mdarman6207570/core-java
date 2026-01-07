package flatmap_int_long_double;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class FlatMapToLongDemo 
{
	public static void main(String[] args) 
	{
		long []a1 = new long[] {21,22,33};
		long []a2 = new long[] {48,52,64};
		long []a3 = new long[] {77,85,93};
		
		List<long[]> arr = Arrays.asList(a1,a2,a3);
		
		LongStream flatMaptoLong = arr.stream().flatMapToLong(array -> Arrays.stream(array));
		flatMaptoLong.forEach(System.out::println);
	}

}
