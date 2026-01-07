package string_method_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo4 
{
	public static void main(String[] args) 
	{
		String s1 = "Java is a platform independent language. Java is everywhere. Java is a beautiful language";
	    
		Pattern pattern = Pattern.compile("Java");
		Matcher matcher = pattern.matcher(s1);
		
		int count = 0;
		while(matcher.find())
		{
			count++;
			System.out.println(matcher.group()+" has appeared at "+matcher.start()+" index "+count+" times in the String :"+s1);
		}
	}

}
