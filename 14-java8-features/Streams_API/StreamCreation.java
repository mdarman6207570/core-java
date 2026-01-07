package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

record Product(Integer id,String name,Double price)
{
	
}

public class StreamCreation 
{
	public static void main(String[] args) 
	{
		System.out.println("1) By uslilng stream() & parallelStream() method s");
		List<String> list = Arrays.asList("NIT","Java","Stream","Collection");
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);
		
		System.out.println("................");
		Stream<String> ParallelStream = list.parallelStream();
		ParallelStream.forEach(System.out::println);
		
		System.out.println("2) By uslilng stream() method of Arrays class");
		int []x = {12,90,89,12,56,45};
		IntStream intStream = Arrays.stream(x);
		intStream.forEach(System.out::println);
		
		long []y = {1L,2L,6L,9L};
		LongStream longStream = Arrays.stream(y);
		longStream.forEach(System.out::println);
		
		System.out.println("....................");
		
		double []z = {1D,2D,3D,4D};
		DoubleStream doubleStream = Arrays.stream(z);
		doubleStream.forEach(System.out::println);
		
		
		System.out.println("....................");
		String []cities = {"Hyd","Indore","Pune"};
		Stream<String> stream4 = Arrays.stream(cities);
		stream4.forEach(System.out::println);
		
		
		System.out.println("3) of() static method of Stream interface");
		Product p1 = new Product(333, "Mobile", 12789D);
		Product p2 = new Product(222, "Camera", 54789D);
		Product p3 = new Product(111, "Laptop", 43789D);
		Product p4 = new Product(111, "Laptop", 43789D);
		
		Stream.of(p1,p2,p3,p4).forEach(System.out::println);
		
		System.out.println("4) itrerate() & generate() method [Infinite Stream]");
	    
		Stream<Double> s1 = Stream.generate(() -> Math.random()).limit(5);
		s1.forEach(System.out::println);
		
		Stream<Integer> iterate = Stream.iterate(101,n -> n+2).limit(5);
		iterate.forEach(System.out::println);
		
	}

}
