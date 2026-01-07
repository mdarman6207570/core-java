package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo8 
{
	public static void main(String[] args) 
	{
		String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
       
		
		 List<String> nameInUpperCase = Arrays.stream(names).map(name ->name.toUpperCase()).collect(Collectors.toList());
		
		
	    System.out.println("UpperCase String : "+nameInUpperCase);
	}
}
