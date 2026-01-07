package optional_demo;

import java.util.Optional;

class Employee
{
	private Integer id;
	private String name;
	
	public Employee()
	{
		
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Optional<Integer> getId()
	{
		return Optional.ofNullable(this.id);
	}
	
	public Optional<String> getName()
	{
		return Optional.ofNullable(this.name);
	}
}

public class OptionalDemo6NewGetter 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee(111,"Scott");
		
		Optional<Integer> id = e1.getId();
		System.out.println(id);
		System.out.println(id.orElse(0));
		
		Optional<String> name = e1.getName();
		System.out.println(name.orElse("Name is not Available"));
		
	}
}
