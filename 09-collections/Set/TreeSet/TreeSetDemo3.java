package _LinkedHashSet__LinkedHashMap__SortedSet__TreeSet;

import java.util.TreeSet;

record Employee(Integer id,String name) implements Comparable<Employee>
{
	@Override
	public int compareTo(Employee e) 
	{
		return this.id().compareTo(e.id);
	}
}


public class TreeSetDemo3 
{
	public static void main(String[] args) 
	{
		TreeSet<Employee> ts= new TreeSet<>();
		ts.add(new Employee(333, "Scott"));
		ts.add(new Employee(111, "Zuber"));
		ts.add(new Employee(222, "Aryan"));
		
		
		ts.forEach(System.out::println);	
		
	}
}

