package stream_method;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

record Product(Integer id,String name)
{
	
}

public class ToMapDemo3 
{
	public static void main(String[] args) 
	{
		ArrayList<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product(111, "Camera"));
		listOfProducts.add(new Product(222, "Laptop"));
		listOfProducts.add(new Product(222, "Mobile"));
	
		/*
		 * Exception  java.lang.IllegalStateException
	   Map<Integer,String> collect = listOfProducts.stream().collect(Collectors.toMap(Product::id,Product::name));
	   */
		
		 Map<Integer,String> collect = listOfProducts.stream().collect(Collectors.toMap(Product::id,Product::name,(oldkey,newkey) -> newkey));
	   collect.forEach((k,v)-> System.out.println(k+" : "+v));
	}   
}
