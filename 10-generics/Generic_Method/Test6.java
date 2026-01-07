package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test6
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<>();
	    l.add(4);
		l.add(6);
		l.add(5);
		
		UnknownClass u = new UnknownClass();
		int total = u.addValues(l);
		System.out.println("The sum of Integer Object is :"+total);
	}
}

class UnknownClass
{
	public int addValues(List l)
	{
		Iterator it = l.iterator();
		int total = 0;
		while(it.hasNext())
		{
			total += (Integer)it.next();
		}
		return total;
	}
}
