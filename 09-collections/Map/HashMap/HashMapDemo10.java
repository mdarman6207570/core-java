package hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo10 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> flights = new HashMap<>();
		flights.put("Mumbai", 5500);
		flights.put("Banglore", 7000);
		flights.put("Chennai", 6500);
		flights.put("Vizag", 5000);
		flights.put("Goa", 8000);
		
		System.out.println(flights);
		
		//cheapest Flight price
		String cheapest = Collections.min(flights.entrySet(),(f1,f2) -> f1.getValue().compareTo(f2.getValue())).getKey();
		System.out.println("Cheapest flight price is :"+flights.get(cheapest));
	}
}
