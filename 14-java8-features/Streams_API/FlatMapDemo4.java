package stream;

import java.util.Arrays;
import java.util.List;

record Product(Integer id,List<String>listOfProducts)
{
	
}

public class FlatMapDemo4 
{
	public static void main(String[] args) 
	{
		List<Product> listOfProducts = Arrays.asList(
				new Product(1,Arrays.asList("Camera","Mobile","Laptop")),
				new Product(1,Arrays.asList("Bat","Ball","Wicket")),
				new Product(1,Arrays.asList("Chair","Table","Lamp")),
				new Product(1,Arrays.asList("Cycle","Bike","Car"))
				);
	
		System.out.println(listOfProducts);
		System.out.println("......................");
		
		
		List<String> flatMap = listOfProducts.stream().flatMap(product -> product.listOfProducts().stream()).toList();
		System.out.println(flatMap);
	}

}
