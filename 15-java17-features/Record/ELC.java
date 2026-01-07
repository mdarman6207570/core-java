package record_demo;

public class ELC 
{
	public static void main(String[] args) 
	{
		EmployeeClass c1 = new EmployeeClass(111, "Scott");
		System.out.println(c1);
		EmployeeClass c2 = new EmployeeClass(111, "Scott");
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+" : "+c2.hashCode());
		System.out.println(c1.getEmpId()+" : "+c2.getEmpId());  //getter
		
		System.out.println(".........................................");
		
		EmployeeRecord r1 = new EmployeeRecord(999, "Allen");
		System.out.println(r1);
		EmployeeRecord r2 = new EmployeeRecord(999, "Allen");
		System.out.println(r1.equals(r2));
		System.out.println(r1.hashCode()+" : "+r2.hashCode());
	    System.out.println(r1.id()+" : "+r2.id());	
		
	}
}
