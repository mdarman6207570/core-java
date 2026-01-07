package lamdamcq;

import java.util.function.Consumer;

public class Java8_19 
{
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println("Naresh I Technologies");
		value.accept("");
	}
}
