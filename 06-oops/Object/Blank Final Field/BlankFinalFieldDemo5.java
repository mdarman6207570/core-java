package blank_final_field;

class Student
{
	private final String jobTitle;
	
	public Student()
	{
		jobTitle = "IT Developer";
	}
	
	public Student(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}
	
	public String getJobTitle() 
	{
		return jobTitle;
	}
}

public class BlankFinalFieldDemo5 {

	public static void main(String[] args) 
	{
     Student raj = new Student();
     System.out.println("He is an "+raj.getJobTitle() );
     
     Student rahul = new Student("Software Engineer");
     System.out.println("He is a "+rahul.getJobTitle() );

	}

}
