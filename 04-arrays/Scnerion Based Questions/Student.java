package blc;


public record Student(String name,EducationInstitute institute) 
{
	
	public void viewCoursesAndFees()
	{
		for(Course c : institute.courses())
		{
			 System.out.println(c.id() + " : " + c.name() + " : " + c.fee());
		}
	}
	
	public void viewOffers()
	{
		for (Offer o : institute.offers()) 
		{
            System.out.println(o.offerText());
        }
	}
	
	public void enrollInCourse(int courseId )
	{
		institute.enrollStudentInCourse(courseId, name);
	}
}
