package optional_demo;

import java.util.Optional;

public class OptionalDemo3
{
	public static void main(String[] args) 
	{
		String str = null;
		
		Optional<String> optional = Optional.ofNullable(str);
		String orElse = optional.orElse("No value in the container :");
		System.out.println(orElse);
	}

}
