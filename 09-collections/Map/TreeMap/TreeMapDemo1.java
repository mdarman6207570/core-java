package sortedMap__TreeMap__HashTable__WeakHashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo1 
{
	public static void main(String[] args) 
	{
		TreeMap  map= new TreeMap();
		
		map.put("Ravi","1");
		map.put("two",null);
		map.put("three",3);
		map.put("four",true);
		
		System.out.println(map);
		
		displayMap(map);
		
	}	
		public static void displayMap(TreeMap map)
		{
			Collection c = map.entrySet();
			
			Iterator i = c.iterator();
			i.forEachRemaining(x -> System.out.println(x));
		}

}
