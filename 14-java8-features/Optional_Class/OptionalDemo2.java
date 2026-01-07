package optional_demo;

import java.util.Optional;

public class OptionalDemo2
{
	public static void main(String[] args) 
	{
		String str = null;
		
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println("Value in the container :"+optional.get());
	}

}
