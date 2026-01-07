package day_21_Oops_Intro;

class Student
{
	String name;
	int age;
	double height;
	
	public void talk()
	{
		System.out.println("Hello learner, My name is :"+name);
		System.out.println("My Age is :"+age);
		System.out.println("And my Height is :"+height);
	}
	
	public void writeExam() 
	{
		System.out.println("Every saturday, "+name+" is writing Java Exam");
	}
}


public class StudentDemo 
{
	public static void main(String[] args) 
	{
		Student raj = new Student();
		//Initialize the non static field using object referce
		raj.name = "Raj Gourav";
		raj.age = 22;
		raj.height = 5.9;
		
	//calling the raj behaviour
		raj.talk();
		raj.writeExam();
		
		System.out.println("..........................");
		
		Student priya = new Student();
		//Initialize the non static field using object referce
		priya.name = "Priya";
		priya.age = 21;
		priya.height = 5.6;
				
			//calling the raj behaviour
		priya.talk();
		priya.writeExam();
		
	}

}
