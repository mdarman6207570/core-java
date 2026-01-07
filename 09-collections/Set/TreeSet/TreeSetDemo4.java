package _LinkedHashSet__LinkedHashMap__SortedSet__TreeSet;

import java.util.TreeSet;

record Student(Integer id,String name) 
{
	
}


public class TreeSetDemo4 
{
	public static void main(String[] args) 
	{
		TreeSet<Student> ts= new TreeSet<>((s1,s2) -> s1.name().compareTo(s2.name()));
		ts.add(new Student(333, "Scott"));
		ts.add(new Student(111, "Zuber"));
		ts.add(new Student(222, "Aryan"));
		
		
		ts.forEach(System.out::println);	
		
	}
}

