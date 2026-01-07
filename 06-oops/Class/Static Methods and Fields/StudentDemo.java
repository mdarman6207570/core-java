package day_24_Class_Variable_OR_Static_Field;

class Student
{
	int rollNumber;
	String studentname;
	String studentAddress;
	static String collegeName = "NIT";
	static String courseName = "Java";
	
	public void setStudentData(int roll, String name, String address) 
	{
		rollNumber = roll;
		studentname = name;
		studentAddress = address;
	}
	
	public void getSudentData() 
	{
		System.out.println("Student Roll is :"+rollNumber);
		System.out.println("Student Name is :"+studentname);
		System.out.println("Student Address is :"+studentAddress);
		System.out.println("College Name is :"+collegeName);
		System.out.println("Course Name is :"+courseName);
	}
}

public class StudentDemo 
{
	public static void main(String[] args) 
	{
		Student scott = new Student();
		scott.setStudentData( 101,"Scott","Ameerpet");
		scott.getSudentData();
		
		System.out.println(".........................");
		
		Student smith = new Student();
		smith.setStudentData( 102,"Smith","S R Nagar");
		smith.getSudentData();
		
		System.out.println(".........................");
		
		Student allen = new Student();
		allen.setStudentData( 103,"Alen","Koti");
		allen.getSudentData();
		
	
		
	}

}
