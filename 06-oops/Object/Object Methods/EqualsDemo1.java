package sunday_day_03_equals;

class Employee
{
	private int id;
	private String name;
	
	public Employee(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
}

public class EqualsDemo1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(111, "Raj");
		Employee e2 = new Employee(111, "Raj");
		
		System.out.println(e1==e2);        //false
		System.out.println(e1.equals(e2)); //false
	}

}
