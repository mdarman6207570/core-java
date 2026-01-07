package _LinkedHashSet__LinkedHashMap__SortedSet__TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts= new TreeSet<>();
		ts.add("Mango");
		ts.add("Grapes");
		ts.add("Apple");
		ts.add("Orange");
		
		System.out.println("In Ascending order :");
		ts.forEach(System.out::println);
		
		System.out.println("In Descending order :");
		Iterator<String> descItr = ts.descendingIterator();
		descItr.forEachRemaining(System.out::println);
	}

}
