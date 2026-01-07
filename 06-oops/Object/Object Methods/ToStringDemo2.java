package sunday_day_02__Objects_and_its_Methods;

class Employee2
{
	private Integer id;
	private String name;
	private double salary;
	
	public Employee2(Integer id, String name, double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class ToStringDemo2 
{
	public static void main(String[] args) 
	{
		Employee2 e1 = new Employee2(111, "Scott", 80000);
		System.out.println(e1);
		
		Employee2 e2 = new Employee2(112, "Scott", 80000);
		System.out.println(e2);
	}

}
