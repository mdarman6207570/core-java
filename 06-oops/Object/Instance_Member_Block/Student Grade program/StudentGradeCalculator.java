package passing_object_reference.elc;

import java.util.Scanner;

import passing_object_reference.blc.CalculateStudentGrade;
import passing_object_reference.blc.Student;
import passing_object_reference.blc.StudentGrade;



public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.nextLine();
		System.out.println("Enter Marks:");
		int marks = Integer.parseInt(sc.nextLine());
		Student asad = new Student(name, marks);
  
	 StudentGrade st = CalculateStudentGrade.calculateGrade(asad);
      System.out.println(st);
   }
}