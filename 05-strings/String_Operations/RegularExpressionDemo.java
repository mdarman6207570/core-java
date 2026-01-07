package string_methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo 
{
	public static void main(String[] args) 
	{
		Pattern pattern = Pattern.compile("a+b*");
		Matcher matcher = pattern.matcher("ab");
		boolean isMatching = matcher.matches();
		System.out.println("Is matcher is matching with the pattern :"+isMatching);
		
		System.out.println(".........................................");
	   
		//The above logic we can write in short
		
		boolean matches = Pattern.matches("a*b*", "ab");
		System.out.println("Is matcher is matching with the pattern :"+matches);
	}
}
