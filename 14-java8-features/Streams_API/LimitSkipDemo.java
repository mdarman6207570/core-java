package stream_methods;

import java.util.stream.Stream;

public class LimitSkipDemo 
{
	public static void main(String[] args) 
	{
		Stream<String> s = Stream.of("Virat","Rohit","Dhoni","Zaheer","Raina","Sahwag","Sachin","Bumrah");
		s.limit(6).forEach(System.out::println);
		
		System.out.println(".........................");
		
		Stream<String> of = Stream.of("Virat","Rohit","Dhoni","Zaheer","Raina","Sahwag","Sachin","Bumrah");
		of.skip(2).forEach(System.out::println);
	}
}
