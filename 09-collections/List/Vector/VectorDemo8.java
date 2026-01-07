package vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


record Customer(Integer id,String name)
{
	
}

public class VectorDemo8 
{
	public static void main(String[] args) 
	{
		Vector<Customer> listOfCustomers = new Vector<Customer>();
		listOfCustomers.add(new Customer(111, "Scott"));
		listOfCustomers.add(new Customer(222, "Smith"));
		listOfCustomers.add(new Customer(333, "Alen"));
		listOfCustomers.add(new Customer(4444, "john"));
		
		//Enumeration approach
		Enumeration<Customer>elements = listOfCustomers.elements();
		
		
		//Backward Compatibility
		Iterator<Customer>asIterator = elements.asIterator();
		asIterator.forEachRemaining(System.out::println);
	}

}
