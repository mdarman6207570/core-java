package sortedMap__TreeMap__HashTable__WeakHashMap;

import java.util.WeakHashMap;

record Product2(Integer id,String name,Double price)
{
	@Override
	protected void finalize() 
	{
		System.out.println("Product object is eligible 4 GC");
	}
}

public class WeakHashMapDemo1
{
	public static void main(String[] args) 
	{
		Product2 p1 = new Product2(111,"Laptop",96000D);
		
		WeakHashMap<Product2,String> map = new WeakHashMap<>();
		map.put(p1, "Hyd");
		
		System.out.println(map);
		
		p1=null;
		System.gc();
		
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println(map);
		
	}
}
