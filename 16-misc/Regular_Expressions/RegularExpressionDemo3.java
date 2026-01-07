package string_method_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo3
{
	public static void main(String[] args) 
	{
		String str = "Java is platform independent Language";
		
		Pattern pattern  = Pattern.compile("Java");
		Matcher matcher = pattern.matcher(str);
		boolean isMatching = matcher.matches();
		System.out.println(isMatching);
		
		boolean b = matcher.find();
		System.out.println(b);
	}

}
