package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo10 
{
	public static void main(String[] args) 
	{
		String []names = {"James", "Aryan", "Vibha", "Aniket"};
		List<Character> ch = Arrays.stream(names).map(c->c.charAt(0)).collect(Collectors.toList());
		
		
	    System.out.println("First Letters: "+ch);
	}
}
