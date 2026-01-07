package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo9 
{
	public static void main(String[] args) 
	{
		Map<String,List<String>> studentSubject = new HashMap<>();
		
		studentSubject.computeIfAbsent("Scott", key -> new ArrayList<String>()).add("Phy");
		studentSubject.computeIfAbsent("Scott", key -> new ArrayList<String>()).add("Che");
	    
		studentSubject.computeIfAbsent("Alen", key -> new ArrayList<String>()).add("History");
		studentSubject.computeIfAbsent("Alen", key -> new ArrayList<String>()).add("Geography");
		
	    studentSubject.computeIfPresent("Scott", (key,val) -> {val.add("Math"); return val;});
	    studentSubject.computeIfPresent("Alen", (key,val) -> {val.add("Econmics"); return val;});
		
		System.out.println(studentSubject);
		
		System.out.println("Iterating through loop");
		
		for(Map.Entry<String, List<String>> entrySet : studentSubject.entrySet())
		{
			System.out.println(entrySet.getKey()+" -> "+entrySet.getValue());
		}
	}
}
