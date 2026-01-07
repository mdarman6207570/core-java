package hashset;

import java.util.HashSet;

public class HashSetDemo5 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add(new String("India"));
		hs1.add(new String("India"));
		System.out.println(hs1.size());
		
		HashSet<StringBuffer> hs2 = new HashSet<StringBuffer>();
		hs2.add(new StringBuffer("India"));
		hs2.add(new StringBuffer("India"));
		System.out.println(hs2.size());
		
	}
}
