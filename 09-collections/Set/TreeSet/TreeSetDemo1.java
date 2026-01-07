package _LinkedHashSet__LinkedHashMap__SortedSet__TreeSet;

import java.util.TreeSet;

public class TreeSetDemo1 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(78);  //comrpareTo of Integer class
		ts.add(15);
		ts.add(34);
		ts.add(67);
		ts.add(90);
		//ts.add("Nit");   //CCE
		//ts.add(null);      //NPE
		
		System.out.println(ts);	
	}

}
