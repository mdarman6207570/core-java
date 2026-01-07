package blc;

public record EducationInstitute(Course[] courses, Offer[] offers)
{
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		boolean found = false;
		
		for(Course c: courses)
		{
			if(c.id() == courseId)
			{
				 System.out.println(studentName + " enrolled in: " + c.name());
	             found = true;
	             break;
			}
		}
		
		if (!found) 
		{
            System.out.println("Course with ID " + courseId + " not found.");
        }
	}
}
