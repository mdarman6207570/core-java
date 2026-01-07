package singlel_level_inheritance;

public class PermanentEmployee extends TemporaryEmployee 
{
	protected String department;
	protected String designation;
	
	
	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary, String department,
			String designation) 
	{
		super(employeeId, employeeName, employeeSalary);
		this.department = department;
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", department=" + department + ", designation=" + designation + "]";
	}
}
