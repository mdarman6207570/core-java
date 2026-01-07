package sortedMap__TreeMap__HashTable__WeakHashMap;

import java.util.TreeMap;

record Product(Integer id,String name) 
{
	
}

public class TreeMapDemo3 
{
	public static void main(String[] args) 
	{
		TreeMap<Product,String> map= new TreeMap<>((s1,s2) -> s1.name().compareTo(s2.name()));
		map.put(new Product(222, "Mobile"),"Hyderabd");
		map.put(new Product(111, "Laptop"),"Chennai");
		map.put(new Product(333, "Camera"),"Pune");
		
		
		System.out.println(map);	
		
	}
}

