package sortedMap__TreeMap__HashTable__WeakHashMap;

import java.util.TreeMap;

public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		TreeMap<Object,String> t = new TreeMap<Object, String>();
		t.put(4, "Ravi");
		t.put(7, "Aswin");
		t.put(2, "Ananya");
		t.put(1, "Dinesh");
		t.put(9, "Ravi");
		t.put(3, "Ankita");
		t.put(5, null);
		
		System.out.println(t);
	}

}
