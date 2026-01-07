package stream;

import java.util.stream.Stream;

public class StreamCloseOperation 
{
	public static void main(String[] args) 
	{
		Stream<Integer> strm = Stream.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(strm);
		strm.forEach(System.out::println);
		
		System.out.println("........................");
		
		strm.forEach(System.out::println);
	}

}
