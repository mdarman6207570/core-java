package stream_methods;

import java.util.Arrays;
import java.util.List;

public class PeekDemo1 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Ravi","Scott","Raj","Smith");
		
		List<String> collect = names.stream().
				filter(name -> name.length()>4)
				.peek(name -> System.out.println("Filtered :"+name.toLowerCase()))
				.map(str -> str.toUpperCase())
				.peek(name -> System.out.println("Mapped "+name)).toList();
		
		
		System.out.println("=================================");
		System.out.println(collect);
		System.out.println("....................");
		System.out.println(names);
	}
}
