package lambda;

import java.util.function.BiFunction;

public class Lambda14 
{
	public static void main(String[] args) 
	{
		//BiFunction to concatenate two strings
		BiFunction<String, String, String> concatenateString = (str1,str2) -> str1+str2;
		
		String result = concatenateString.apply("Hello", "Java");
		System.out.println(result);
		
		
		//BiFunction to find length of two strings
	   BiFunction<String, String, Integer> calculateLength = (str1,str2) -> str1.length()+str2.length();
	   Integer result1 = calculateLength.apply("Hello", "Java");
	}
}
