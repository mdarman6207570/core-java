package day_46_HAS_A_RELATION;

class College
{
	private String collegeName;
	private String location;
	
	public College(String collegeName, String location) 
	{
		super();
		this.collegeName = collegeName;
		this.location = location;
	}

	@Override
	public String toString() 
	{
		return "College [collegeName=" + collegeName + ", location=" + location + "]";
	}
	
}

class Student
{
	private int studentId;
	private String studentName;
	private final College college;
	
	public Student(int studentId, String studentName, College college) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.college = college;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", college=" + college + "]";
	}	
}

public class AggregationDemo 
{
	public static void main(String[] args) 
	{
		College vit = new College("VIT", "Vellore");
		College nit = new College("NIT", "Hyderabad");
		
		Student s1 = new Student(101, "Scott",nit);
		System.out.println(s1);
		
		Student s2 = new Student(102, "Smith",nit);
		System.out.println(s2);
	}
}
