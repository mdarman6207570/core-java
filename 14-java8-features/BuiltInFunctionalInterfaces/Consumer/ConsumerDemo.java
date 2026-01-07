package day_63_Predefined_Functional_Interface;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) 
	{
		Consumer<Integer> c1 = num -> System.out.println("Integer value :"+num);
		c1.accept(12);
		
		Consumer<String> c2 = str  -> System.out.println("String value :"+str);
		c2.accept("Arman");
		
		Consumer<Float> c3 = flt -> System.out.println("Float value :"+flt);
		c3.accept(12F);
		
		Consumer<Boolean> c4 = bool -> System.out.println("Boolean value :"+bool);
		c4.accept(true);
		
		Consumer<Customer> c5 = cust -> System.out.println("Customer value :"+cust);
		c5.accept(new Customer(101, "Arman"));
	}
}

record Customer(Integer id, String name)
{
	
}
