package vector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

record Product(Integer id,String name,Double price) implements Comparable<Product>
{

	@Override
	public int compareTo(Product p2) 
	{
		return this.id.compareTo(p2.id);
	}
	
}


public class VectorDemo4 
{
	public static void main(String[] args) 
	{
		List<Product> listOfProducts = new Vector<>();
		listOfProducts.add(new Product(333, "Laptop", 96908D));
		listOfProducts.add(new Product(111, "mobile", 63000D));
		listOfProducts.add(new Product(222, "Camera", 45000D));
		
		System.out.println("Printing Original Data :");
		listOfProducts.forEach(System.out::println);
		
		Collections.sort(listOfProducts);
		
		System.out.println("Printing  Data after sorting based on ID :");
		listOfProducts.forEach(System.out::println);
		
		System.out.println("Printing  Data after sorting based on Name :");
		listOfProducts.sort((p1,p2) -> p1.name().compareTo(p2.name()));
		listOfProducts.forEach(System.out::println);
	}

}
