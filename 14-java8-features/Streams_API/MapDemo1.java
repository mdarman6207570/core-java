package stream;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 
{
	public static void main(String[] args) 
	{
		List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//increase all value by 10
		
		System.out.println("Original Number :"+listOfNumbers);
		
		listOfNumbers.stream().map(num -> num+10).forEach(System.out::println);
		
		//fetch all unique even & find cube
		
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,2,3,4,6,8);
		
		System.out.println("Cube of all the unique Even numbers :");
		list.stream().distinct().filter(num ->num%2==0).map(n -> n*n*n).forEach(System.out::println);
	}

}
