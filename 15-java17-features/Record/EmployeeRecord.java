package record_demo;
               
              //Canonical Constructor (components -> final)
public record EmployeeRecord(int id, String name) 
{
	public EmployeeRecord
	{
		if(id < 0)
		{
			System.out.println("Id is Invalid");
			System.exit(0);
		}
	}
}
