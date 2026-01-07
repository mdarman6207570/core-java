package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Employee(Integer id,String name,Double salary) 
{
	
}

public class FilterDemo3 
{
	public static void main(String[] args) 
	{
		// Fetch all the Employees name whose salary is greater than 50k
		
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee(111, "Scott", 56000D));
		listOfEmployee.add(new Employee(222, "Alen", 76000D));
		listOfEmployee.add(new Employee(333, "Smith", 46000D));
		listOfEmployee.add(new Employee(444, "John", 48000D));
		listOfEmployee.add(new Employee(555, "Raj", 58000D));
		
		System.out.println("Name of the employees whose salary > 50k");
        List<Employee> filterEmp = listOfEmployee.stream().filter(emp -> emp.salary()>50000).collect(Collectors.toList());
        filterEmp.forEach(emp -> System.out.println(emp.name()));
	}

}
