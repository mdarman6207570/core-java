package collection_intro;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class PossibleWaysToRetrieveCollectionObject 
{
	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Kolkata");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Mumbai");
		
		System.out.println("1) By using toString() method :");
		System.out.println(listOfCity);
		System.out.println("..................................................");
		
		
		System.out.println("2) By using ordinary for loop :");
		for(int i=0;i<listOfCity.size();i++)
		{			
			System.out.println(listOfCity.get(i));
		}
		System.out.println("..................................................");
		
		
		System.out.println("3) By using for each loop :");
		for(String city : listOfCity)
		{			
			System.out.println(city);
		}
		System.out.println("..................................................");
		
		
		System.out.println("4) By using Enumeration interface :");
		Enumeration<String> ele = listOfCity.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		System.out.println("..................................................");
		
		
		System.out.println("5) By using Iterator interface :");
		Iterator<String> iterator = listOfCity.iterator();
		iterator.forEachRemaining(city -> System.out.println(city));
		System.out.println("..................................................");
		
		
		System.out.println("6) By using ListIterator interface :");
		ListIterator<String> lst = listOfCity.listIterator();
		
		System.out.println("IN FORWARD DIRECTION :");
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		
		System.out.println("IN BACKWARD DIRECTION :");
		while(lst.hasPrevious())
		{
			System.out.println(lst.previous());
		}
		System.out.println("..................................................");
		
		
		System.out.println("7) By using Spliterator interface :");
		Spliterator<String> spliterator = listOfCity.spliterator();
		spliterator.forEachRemaining(city -> System.out.println(city));
		System.out.println("..................................................");
		
		
		System.out.println("8) By using forEach method :");
		listOfCity.forEach(city -> System.out.println(city));
		System.out.println("..................................................");
		
		System.out.println("9) By using method Reference :");
		listOfCity.forEach(System.out::println);
		System.out.println("..................................................");
		
		
		System.out.println("10) By using stream() method of Collection interface :");
		listOfCity.stream().forEach(System.out::println);
		System.out.println("..................................................");
	
		System.out.println("11) By using parallelStream() method of Collection interface :");
		listOfCity.parallelStream().forEach(System.out::println);
		System.out.println("..................................................");
	}

}
