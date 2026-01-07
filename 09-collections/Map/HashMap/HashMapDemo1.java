package day_101_HasMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Vanilla");
		map.put(2, "ButterScoch");
		map.put(3, "Chocolate");
		map.put(4, "Cotton");
		
		System.out.println("By using toString Method()");
		System.out.println("HashMap: "+map);
		
		System.out.println("By using forEach() Method() :");
		map.forEach((key,value) ->System.out.println(key +" : "+value));
	   
		String value = map.get(2);
		System.out.println("Value for key 2: "+ value);
		
		value = map.getOrDefault(3, "Key is not available");
		System.out.println("Value for key 3:"+value);
		
		boolean haskey = map.containsKey(3);
		System.out.println("HashMap contains key 3:"+haskey);
		
		boolean hasValue = map.containsValue("Vanilla");
		System.out.println("HashMap contains value Vanilla:"+hasValue);
		
		map.remove(1);
		System.out.println("HashMap After removing after key 1: "+map);
		
		System.out.println("Iterating through HashMap:");
		Iterator<Entry<Integer,String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Integer,String> entry = iterator.next();
			System.out.println("Key is :"+entry.getKey()+", Value is :"+entry.getValue());
		}		
		
		System.out.println("Iterating through Iterator: ");
		Iterator<Entry<Integer,String>> itr = map.entrySet().iterator();
		itr.forEachRemaining(entry -> System.out.println(entry));
		
		int size = map.size();
		System.out.println("Size of HashMap: "+size);
		
		map.clear();
	
		System.out.println("HashMap After clearing : "+map);
		System.out.println("Is Map Empty : "+map.isEmpty());
	}

}
