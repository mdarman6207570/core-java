package constructor_method_reference;

import java.util.function.BiFunction;

class Employee
{
	private Integer id;
	private String name;
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class ConstrucotorMethodReferenceDemo3 
{
	public static void main(String[] args) 
	{
		BiFunction<Integer, String, Employee> fn = Employee::new;
		Employee obj = fn.apply(12, "James");
		System.out.println(obj);
	}

}
