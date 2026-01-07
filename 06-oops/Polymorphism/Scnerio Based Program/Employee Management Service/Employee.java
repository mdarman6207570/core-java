package blc;

public class Employee 
{
	protected int id;
	protected String name;
	
	public Employee(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double calculateSalary()
	{
		return 0.0;
	}
}
