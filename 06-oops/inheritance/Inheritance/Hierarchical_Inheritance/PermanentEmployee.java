package blc;

public class PermanentEmployee extends Employee 
{
    protected double providentfund;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) 
	{
		super(employeeId, employeeName, employeeSalary);
		
		providentfund += (employeeSalary*0.12);
	}

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentfund=" + providentfund + "]";
	}

	public void netSalary() 
	{
		System.out.println("Net Salary is :"+(employeeSalary+providentfund));
	}

	
	
    
    
}