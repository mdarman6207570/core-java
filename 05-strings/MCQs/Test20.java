package string.mcqs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test20 
{
	public static void main(String[] args)
	{
	    Pattern pattern = Pattern.compile("123");
        Matcher matcher = pattern.matcher("abc123xyz");
        System.out.println(matcher.matches());
    }
}
