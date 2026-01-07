package utilityclasses;

import java.util.Arrays;
import java.util.Comparator;

//: [Sort Employee By id,name,salary In Descendig Order]

public class Employee2 {
	int id;
	String name;
	double salary;

	public Employee2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

public static void main(String[] args) { 
Employee2 arr[] = { new Employee2(4, "asif", 4749), new Employee2(1, "ashish", 
6454), new Employee2(2, "xyz", 7463)}; 

Arrays.sort(arr,Comparator.comparing((Employee2 e)->e.name).reversed());
for(Employee2 x:arr)
{ 
System.out.println(x);
}
}
}