package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo8 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> map = new HashMap<>();
		
		map.merge("A", 10, (oldvalue,newvalue) -> oldvalue+newvalue);
		map.merge("A", 15, (oldvalue,newvalue) -> oldvalue+newvalue);
		map.merge("A", 25, (oldvalue,newvalue) -> oldvalue+newvalue);
		map.merge("B", 25, (oldvalue,newvalue) -> oldvalue+newvalue);
		map.merge("B", 25, (oldvalue,newvalue) -> oldvalue+newvalue);
		
		System.out.println(map);
		
		System.out.println("=====================================");
		
		Map<String,Integer> map1 = new HashMap<>();
		
		map1.computeIfAbsent("A", key -> key.length());
		map1.computeIfAbsent("B", key -> 10);
		map1.computeIfAbsent("A", key -> 20);
		map1.computeIfAbsent("C", key -> 30);
		
		map1.merge("C", 30, (oldvalue,newvalue) -> oldvalue+newvalue);
		System.out.println(map1);
		
		map1.merge("C", 30, (oldvalue,newvalue) -> null);
		System.out.println(map1);
	}
}
