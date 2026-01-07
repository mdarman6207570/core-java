package sortedMap__TreeMap__HashTable__WeakHashMap;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo2 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer,String> map = new Hashtable<Integer, String>();
		map.put(1, "Priyanka");
		map.put(2, "Ruby");
		map.put(3, "Vibha");
		map.put(4, "Kanchan");
		
		map.putIfAbsent(5, "Bina");
		map.putIfAbsent(24, "Pooja");
		map.putIfAbsent(26, "Ankita");
		
		map.putIfAbsent(14, "Sneha");
		
		System.out.println("Updated Map :"+map);
	}
}
