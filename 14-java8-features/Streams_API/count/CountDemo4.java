package count;

import java.util.Arrays;
import java.util.List;

public class CountDemo4
{
	public static void main(String[] args) 
	{
		List<String> listOfName = Arrays.asList("Raj","Ravi","Rohit","Virat","Raj","Aradhya","Scott");
		
		long count = listOfName.stream().map(String::toUpperCase).filter(s -> s.contains("A")).distinct().count();
		
		System.out.println("Count of unique name containing A :"+count);
	}
}
