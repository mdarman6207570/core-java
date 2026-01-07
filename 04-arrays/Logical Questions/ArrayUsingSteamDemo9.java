package array_using_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUsingSteamDemo9 
{
	public static void main(String[] args) 
	{
		Boolean[] flags = {true, false, true, false, true};
       
		
		 List<String> YesNo = Arrays.stream(flags).map(flag->flag?"Yes":"No").collect(Collectors.toList());
		
		
	    System.out.println("Yes/No Values : "+YesNo);
	}
}
