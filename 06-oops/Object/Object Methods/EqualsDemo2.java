package sunday_day_03_equals;

class Employee2
{
	private int id;
	private String name;
	
	public Employee2(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		//retrieve first object data
		int eid1 = this.id;
		String name1 = this.name;
		
		//Retrieves second object data
		Employee2 e2 = (Employee2)obj;
		int eid2 = e2.id;
		String name2 = e2.name;
		
		if(eid1 == eid2 && name1 == name2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}




public class EqualsDemo2 
{
	public static void main(String[] args) 
	{
		Employee2 e1 = new Employee2(111, "Raj");
		Employee2 e2 = new Employee2(111, "Raj");
		
		System.out.println(e1.equals(e2)); //true
		System.out.println(e1.hashCode()+" :"+e2.hashCode());       
	}
}
