package stream_method;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

record Customer(Integer id,String name,Double bill)
{
	
}

public class ToMapDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();
		listOfCustomers.add(new Customer(111, "Scott", 23789D));
		listOfCustomers.add(new Customer(222, "Smith", 24789D));
		listOfCustomers.add(new Customer(333, "Alen", 27789D));
	
	   Map<Integer,String> collect = listOfCustomers.stream().collect(Collectors.toMap(Customer::id,Customer::name));
	   
	   collect.forEach((k,v)-> System.out.println(k+" : "+v));
	}   
}
