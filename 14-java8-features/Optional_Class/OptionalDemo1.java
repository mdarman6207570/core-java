package optional_demo;

import java.util.Optional;

public class OptionalDemo1 
{
	public static void main(String[] args) 
	{
		String str = null;
		Optional<String> optional = Optional.ofNullable(str);
		if(optional.isPresent())
		{
			System.out.println(optional.get());
		}
		else
		{
			System.err.println("No Value is available in the container");
		}
	}

}
