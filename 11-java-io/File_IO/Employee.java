package serialization;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
    private Double salary;
    
	public Employee(Integer id, String name, Double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
    
	
	public static Employee getEmployeeObject()
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Emter Employee Id :");
	    int id = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("Emter Employee Name :");
	    String name = sc.nextLine();
	    
	    System.out.println("Emter Employee Salary :");
	    double salary = Double.parseDouble(sc.nextLine());
	    
	    return new Employee(id, name, salary);
	}
    
}
