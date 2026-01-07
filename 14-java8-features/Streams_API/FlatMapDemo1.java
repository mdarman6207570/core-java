package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 
{
	public static void main(String[] args) 
	{
		List<String> indianPlayer = Arrays.asList("Rohit","Virat","Gill","Bumrah");
		List<String> engPlayer = Arrays.asList("Stoke","Root","Brook","Butler");
		
		List<List<String>> nestedColl = Arrays.asList(indianPlayer,engPlayer);
		
		System.out.println("Nested collection");
		System.out.println(nestedColl);
		
		System.out.println("Flattening using flatMap()");
		
		List<String> flatMap = nestedColl.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(flatMap);
	}

}
