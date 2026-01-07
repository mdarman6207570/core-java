package sortedMap__TreeMap__HashTable__WeakHashMap;

import java.util.TreeMap;

record Student(Integer id,String name) implements Comparable<Student>
{   @Override
    public int compareTo(Student s) 
    {
	   return this.id().compareTo(s.id());
    }
}

public class TreeSetMapDemo4 
{
	public static void main(String[] args) 
	{
		TreeMap<Student,String> map= new TreeMap<>();
		map.put(new Student(222, "Satish"),"Hyderabd");
		map.put(new Student(111, "Zuber"),"Chennai");
		map.put(new Student(333, "Arman"),"Pune");
		
		
		map.forEach((k,v) -> System.out.println(k+"  "+v));
		
		
		
	}
}

