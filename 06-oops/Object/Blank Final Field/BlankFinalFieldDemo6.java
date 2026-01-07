package blank_final_field;

class Studentt
{
	private final String jobTitle;
	
	{
		jobTitle = "IT Developer";
	}
	
	public Studentt()
	{
	
	}
	
	public Studentt(String jobTitle)
	{
		jobTitle = "Ix Developer";
	}
	
	public String getJobTitle() 
	{
		return jobTitle;
	}
}

public class BlankFinalFieldDemo6
{

	public static void main(String[] args) 
	{
     Studentt raj = new Studentt();
     System.out.println("He is an "+raj.getJobTitle() );
     
     Studentt rahul = new Studentt("Software Engineer");
     System.out.println("He is a "+rahul.getJobTitle() );

	}

}
