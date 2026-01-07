package min_max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Product(Integer id,String name,Double price)
{
	
}

//finding the minimum age of Employee
public class MinDemo3 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(111, "Camera", 45000D);
		Product p2 = new Product(111, "Watch", 23000D);
		Product p3 = new Product(111, "Headphone", 2000D);
		Product p4 = new Product(111, "Keyborad", 500D);
		
		
		System.out.println("Minimum price Product is :");
		List<Product>listOfProduct = Arrays.asList(p1,p2,p3,p4);
		
		listOfProduct.stream().min(Comparator.comparingDouble(Product::price)).ifPresent(System.out::println);
	}
}
