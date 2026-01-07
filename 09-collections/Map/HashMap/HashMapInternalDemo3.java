package hashMap;

import java.util.HashMap;

record Customer3(Integer id,String name)
{
	
}

public class HashMapInternalDemo3 
{
	public static void main(String[] args) 
	{
		Customer3 c1 = new Customer3(111, "Scott");
		Customer3 c2 = new Customer3(111, "Scott");
		
		System.out.println(c1.hashCode()+" : "+c2.hashCode());
		System.out.println(c1.equals(c2));
		
		System.out.println("................................");
		
		HashMap<Customer3, String> map = new HashMap<>();
		map.put(c1, "A");
		map.put(c2, "B");
	
		System.out.println(map.size());
		System.out.println(map);
	}
}
