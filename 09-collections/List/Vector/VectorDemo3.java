package vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo3 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,56,34,90,78};
		
		Vector<Integer> numbers = new Vector<>();
		
		for(int i=0;i<arr.length;i++)
		{
			numbers.add(arr[i]);
		}
		
		System.out.println("Original data :");
		
		Enumeration<Integer> elements = numbers.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
		
		System.out.println("Min Value :"+Collections.min(numbers));
		
		System.out.println("Max Value :"+Collections.max(numbers));
		
		Collections.sort(numbers);
		
		System.out.println("Sorted in ascending order :"+numbers);
		
		Collections.reverse(numbers);
		System.out.println("reverse Order :"+numbers);
		
		//Converting Vector to array
		Object[] array = numbers.toArray();
		System.out.println("printing Object array :");
		for(Object obj : array)
		{
			System.out.println(obj);
		}
	}

}
