package day_20_;

class Student
{
	public static String getStudentDetails(int roll, String name,double fees) 
	{
		return "[Student name is :"+name+", roll is :"+roll+", fee is :"+fees+"]";
	}
	
}

public class StudentDetails 
{
	public static void main(String[] args) 
	{
		String details = Student.getStudentDetails(101, "Ravi", 12890.90);
		System.out.println(details);
	}

}
