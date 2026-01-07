package day_69_Scenario__Lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class StudentNotification 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int noOfStudents = Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=noOfStudents;i++)
		{
			System.out.println("Enter details for Student "+i+":");
			
			System.out.println("Enter ID: ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Name :");
			String name = sc.nextLine();
			
			System.out.println("Enter Course :");
			String course = sc.nextLine();
			
			Student student = new Student(id, name, course);
			
			Consumer<Student> consumer = stu ->
			{
				System.out.println("Hello "+stu.name() +"! Welcome to the "+stu.course() +" course.");
			};
			consumer.accept(student);
		}
		sc.close();
	}
}


record Student(Integer id, String name, String course)
{
	
}