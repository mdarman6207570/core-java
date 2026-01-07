package stream;

import java.util.ArrayList;

record Employee(Integer id,String name,Double salary)
{
	
}

public class EmplyeeTable 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(111, "Alen", 55000D));
		emp.add(new Employee(222, "Rohit", 50000D));
		emp.add(new Employee(333, "Scott", 45000D));
		emp.add(new Employee(444, "Gabbar", 52000D));
		emp.add(new Employee(555, "Babbar", 56000D));
		emp.add(new Employee(666, "Ali", 40000D));
		
		emp.stream().filter(e -> e.salary() > 50000).map(e -> e.name().toUpperCase()).forEach(System.out::println);  
	}

}
