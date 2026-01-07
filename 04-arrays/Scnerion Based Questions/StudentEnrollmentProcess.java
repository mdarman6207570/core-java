package elc;

import java.util.Scanner;

import blc.Course;
import blc.EducationInstitute;
import blc.Offer;
import blc.Student;

public class StudentEnrollmentProcess 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Course[] courses =
			{
					new Course(1,"Java",35000.0),
					new Course(2,".Net",30000.0),
					new Course(3,"Python",32000.0)
			};
		
		Offer[] offers = 
			{
	            new Offer("Special discount: Get 20% off on all courses!"),
	            new Offer("Limited time offer: Enroll in any two courses and get one course free!")
	        };
		
		EducationInstitute institute = new EducationInstitute(courses, offers);
		
		System.out.println("Enter student name: ");
		String name = sc.nextLine();
		
		Student student = new Student(name,institute);
		student.viewCoursesAndFees();
		
		student.viewOffers();
		
		System.out.print("Enter course ID to enroll: ");
	    int courseId = sc.nextInt();

	     student.enrollInCourse(courseId);

	     sc.close();
		
		
	}

}
