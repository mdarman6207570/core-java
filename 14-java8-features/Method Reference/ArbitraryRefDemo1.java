package arbitrary_methodref;

import java.util.function.Function;

public class ArbitraryRefDemo1 
{
	public static void main(String[] args)
	{
		Function<String,String> fn = String::toUpperCase;
		System.out.println(fn.apply("java"));
		System.out.println(fn.apply("stream"));
	}

}
