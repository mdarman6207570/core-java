package flatmap_int_long_double;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class FlatMapToDoubleDemo 
{
	public static void main(String[] args) 
	{
		double []a1 = new double[] {1.1,2.2,3.3};
		double []a2 = new double[] {4.8,5.2,6.4};
		double []a3 = new double[] {7.7,8.5,93};
		
		List<double[]> arr = Arrays.asList(a1,a2,a3);
		
		DoubleStream flatMaptoLong = arr.stream().flatMapToDouble(array -> Arrays.stream(array));
		flatMaptoLong.forEach(System.out::println);
	}

}
