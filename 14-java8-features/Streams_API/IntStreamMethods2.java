package intstream_doublestream_demo;

import java.util.ArrayList;

record Employee(String name,Integer experience)
{
	
}

public class IntStreamMethods2 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Scott", 12);
		Employee e2 = new Employee("Smith", 14);
		Employee e3 = new Employee("Alen", 12);
		Employee e4 = new Employee("John", 20);
		Employee e5 = new Employee("Ankit", 5);
		
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(e1);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		listOfEmployee.add(e4);
		listOfEmployee.add(e5);
		
		int sum = listOfEmployee.stream().mapToInt(emp -> emp.experience()).sum();
		System.out.println("Total year of experience is :"+sum);
	}
}
