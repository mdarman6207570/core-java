package optional_demo;

import java.util.Optional;

public class OptionalDemo5
{
	public static void main(String[] args) 
	{
		Integer i = 90;
		Optional<Integer> optional = Optional.ofNullable(i);
		optional.ifPresent(System.out::println);
	}

}
