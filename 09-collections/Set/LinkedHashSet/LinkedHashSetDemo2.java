package _LinkedHashSet__LinkedHashMap__SortedSet__TreeSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(5);
		lhs.add(15);
		lhs.add(20);
		lhs.add(5);
		
		System.out.println("LinkedHashSet elements: "+lhs);
		
		System.out.println("LinkedHashSet size: "+lhs.size());
		
		int elementToCheck = 15;
		
		if(lhs.contains(elementToCheck))
		{
			System.out.println(elementToCheck+" is present in the LinkedListHashSet");
		}
		else
		{
			System.out.println(elementToCheck+" is NOT present in the LinkedListHashSet");
		}
		
		
        int elementToRemove = 10;
		
		if(lhs.contains(elementToRemove))
		{
			System.out.println(elementToRemove+" is removed from the LinkedListHashSet");
		}
		else
		{
			System.out.println(elementToRemove+" is NOT present in the LinkedListHashSet");
		}
		
		lhs.clear();
		System.out.println("After clearing , LinkedHashSet elements:"+lhs);
	}
}
