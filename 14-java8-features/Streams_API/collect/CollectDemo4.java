package collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Department(Integer deptId,String deptName)
{
	
}

record Employee(Integer id,String empName,Double salary, Department dept)
{
	
}

public class CollectDemo4 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(111, "Raj", 23789D, new Department(1, "IT"));
		Employee e2 = new Employee(222, "Rahul", 23789D, new Department(1, "IT"));
		
		Employee e3 = new Employee(333, "Scott", 23789D, new Department(2, "Sales"));
		Employee e4 = new Employee(444, "Smith", 23789D, new Department(2, "Sales"));
		
		Employee e5 = new Employee(555, "Virat", 23789D, new Department(3, "HR"));
		Employee e6 = new Employee(666, "Rohit", 23789D, new Department(3, "HR"));
		
		Stream<Employee> streamOfEmp = Stream.of(e1,e2,e3,e4,e5,e6);
		
		Map<Department,List<Employee>> collect = streamOfEmp.collect(Collectors.groupingBy(Employee::dept));
	   
		collect.forEach((dept,emps) -> System.out.println(dept+" : "+emps));
	}
}
