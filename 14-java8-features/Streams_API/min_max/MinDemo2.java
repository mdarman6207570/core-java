package min_max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Employee(Integer id,String name,Integer age)
{
	
}

//finding the minimum age of Employee
public class MinDemo2 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101, "A", 23);
		Employee e2 = new Employee(102, "B", 25);
		Employee e3 = new Employee(103, "C", 18);
		Employee e4 = new Employee(104, "D", 29);
		Employee e5 = new Employee(105, "E", 19);
		
		System.out.println("Minimum age Employee is :");
		List<Employee>listOfEmployee = Arrays.asList(e1,e2,e3,e4,e5);
		
		listOfEmployee.stream().min(Comparator.comparingInt(Employee::age)).ifPresent(System.out::println);
	}
}
