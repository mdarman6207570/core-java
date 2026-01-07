package day_63_Predefined_Functional_Interface;

import java.util.function.Supplier;

public class SupplierDemo3
{
	public static void main(String[] args) 
	{
		Supplier<Product> p2 = () ->
		{
			return new Product(101, "Arman", 15000D);
		};
		Product product = p2.get();
		System.out.println(product);
	}
}


record Product(Integer id, String name,Double price)
{
	
}