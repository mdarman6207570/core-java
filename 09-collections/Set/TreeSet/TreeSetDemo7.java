package _LinkedHashSet__LinkedHashMap__SortedSet__TreeSet;


import java.util.TreeSet;

record Product(Integer id,String name,Double price) 
{
	
}


public class TreeSetDemo7 
{
	public static void main(String[] args) 
	{
		TreeSet<Product> ts= new TreeSet<>((p1,p2)->p1.id().compareTo(p2.id()));
		ts.add(new Product(333, "Mobile",56789D));
		ts.add(new Product(111, "Laptop",46789D));
		ts.add(new Product(222, "Camera",96789D));
		
		System.out.println("Sorting based on the Id :");
		ts.forEach(System.out::println);	
		
	}
}

