package stream_methods;

import java.util.Arrays;
import java.util.List;

public class PeekDemo2 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(10,15,20,25,30);
		
		List<Integer> result = numbers.stream().filter(n -> n%2==0).peek(n -> System.out.println("Even no :"+n)).map(n ->n*2).peek(n-> System.out.println("Doubled value:"+n)).toList();
     
		System.out.println("Final Result :"+result);
	}
}
