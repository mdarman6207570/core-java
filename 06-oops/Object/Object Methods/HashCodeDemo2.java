package sunday_day_02__Objects_and_its_Methods;

class Employee
{
	
}

public class HashCodeDemo2 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println(e1.equals(e2));
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
