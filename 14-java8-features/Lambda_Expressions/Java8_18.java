package lamdamcq;

import java.util.function.Consumer;

public class Java8_18 
{
	public static void main(String[] args) {
		Consumer<Integer> value = (a) -> System.out.println(a*3);
		value.accept(5);
	}
}
