package stream;

import java.util.ArrayList;

record Employee2(Integer id,String name,Double salary)
{
	
}

public class MapDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee2> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee2(1, "Scott", 800D));
		listOfEmp.add(new Employee2(2, "Smith", 1200D));
		listOfEmp.add(new Employee2(3, "Alen", 1500D));
		listOfEmp.add(new Employee2(4, "Martin", 1800D));
		listOfEmp.add(new Employee2(5, "John", 2000D));
		
		System.out.println("Original Employee Data with base salary");
		listOfEmp.stream().map(emp -> emp.salary()+500).forEach(System.out::println);
	}

}
