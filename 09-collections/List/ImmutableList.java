package vector;

import java.util.List;

public class ImmutableList {

	public static void main(String[] args) 
	{
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11);
		

		//listOfNumber.add(6);    // java.lang.UnsupportedOperationException
		//listOfNumber.remove(0); // java.lang.UnsupportedOperationException
		//list.set(0, 100);        // java.lang.UnsupportedOperationException
		
		list.forEach(System.out::println);
	}

}
