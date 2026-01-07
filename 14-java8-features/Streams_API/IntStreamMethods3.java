package intstream_doublestream_demo;

import java.util.Arrays;

record Product(Integer id,String name,Double price)
{
	
}

public class IntStreamMethods3 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(333,"Camera", 12789D);
		Product p2 = new Product(333,"Laptop", 14789D);
		Product p3 =new Product(333,"Mobile", 18789D);
		Product p4 =new Product(333,"Speaker", 20789D);
		Product p5 =new Product(444,"Keyboard", 3789D);
		Product p6 =new Product(444,"Headphone", 1000D);
		
		
		
		double sum = Arrays.asList(p1,p2,p3,p4,p5,p6).stream().mapToDouble(Product::price).sum();
		System.out.println("Total Product price is :"+sum);
	}
}
