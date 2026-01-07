package vector;

import java.util.Arrays;
import java.util.List;

public class FixedLengthList 
{
	public static void main(String[] args) 
	{
		List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5);
		
		//listOfNumber.add(6);    // java.lang.UnsupportedOperationException
		//listOfNumber.remove(0); // java.lang.UnsupportedOperationException
		
		listOfNumber.set(0, 100); //Valid
		
		listOfNumber.forEach(System.out::println);
		
		
	}

}
