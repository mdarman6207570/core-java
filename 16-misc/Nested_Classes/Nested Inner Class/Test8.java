package non_static_inner_class;

class University
{
	private String name;

	public University(String name) 
	{
		super();
		this.name = name;
	}
	public void displayUniversityName() 
	{
		System.out.println("University Name: "+name);
	}
	
	public class Department
	{
		private String name;
		private String headOfDepartment;
		
		public Department(String name, String headOfDepartment) 
		{
			super();
			this.name = name;
			this.headOfDepartment = headOfDepartment;
		}
		
		//method to display department details
		public void displayDepartmentDetails()
		{
			displayUniversityName();
			System.out.println("Department Name: "+name);
			System.out.println("Head of Department: "+headOfDepartment);
		}	
	}
}


public class Test8 {

	public static void main(String[] args) 
	{
		University university = new University("JNTU");
		
		University.Department cs = university.new Department("Computer Science", "Dr. John");
		
		University.Department ee = university.new Department("Elecrical Engineering", "Dr. Scott"); 
	   
		cs.displayDepartmentDetails();
		ee.displayDepartmentDetails();
	}

}
