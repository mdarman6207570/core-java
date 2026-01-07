package arbitrary_methodref;

import java.util.TreeSet;

public class ArbitraryRefDemo2 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts1 = new TreeSet<String>(String::compareTo);
		ts1.add("C");
		ts1.add("B");
		ts1.add("A");
		
		System.out.println(ts1);
		
		
	}
}
