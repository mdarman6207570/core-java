package arbitrary_methodref;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArbitraryRefDemo3 
{
	public static void main(String[] args) 
	{
		List<Integer> listOfNumbers = Arrays.asList(9,5,6,2,4,1);
		
		Collections.sort(listOfNumbers,Integer::compareTo);
		listOfNumbers.forEach(System.out::println);
		
		System.out.println("...................................");
	   
		String[] playsers = {"Virat","Rohit","Zaheer","Rishab","Abhishek"};
		Arrays.sort(playsers,String::compareTo);
		System.out.println(Arrays.toString(playsers));
	} 
}
