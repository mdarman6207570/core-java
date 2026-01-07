package stream;

import java.util.Arrays;

public class FilterDemo4 
{
	public static void main(String[] args) 
	{
		String []words = {"Scott","Raj","Riya","Smith","Stream"};
		
		System.out.println(Arrays.toString(words));
		
		Object[] arr = Arrays.stream(words).filter(str -> str.length()>3).toArray();
		System.out.println(Arrays.toString(arr));
	}

}
