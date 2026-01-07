package hierarchical_inheritance;

class Employee
{
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;
	
	
	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}	
}

class Developer extends Employee
{
	protected String role;

	public Developer(int employeeId, String employeeName, double employeeSalary, String role) {
		super(employeeId, employeeName, employeeSalary);
		this.role = role;
	}

	@Override
	public String toString() 
	{
		return "Developer [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", role=" + role + "]";
	}	
}

class Designer extends Employee

{
	protected String role;

	public Designer(int employeeId, String employeeName, double employeeSalary, String role) 
	{
		super(employeeId, employeeName, employeeSalary);
		this.role = role;
	}

	@Override
	public String toString() {
		return "Designer [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", role=" + role + "]";
	}
	
	

}


public class HierarchicalDemo 
{

	public static void main(String[] args) 
	{
        var developer = new Developer(101, "Raj", 90000, "Programmer");
        System.out.println(developer);
        
        System.out.println(".....................................");
        
        var designer = new Designer(201, "alen", 45000, "Designer");
        System.out.println(designer);
	}

}
