package stream;

import java.util.ArrayList;

record Student(String name,Double score,String status)
{
	
}

public class OCPJPResult
{
	public static void main(String[] args) 
	{
		ArrayList<Student> emp = new ArrayList<>();
		emp.add(new Student("Alen", 65D,"PASS"));
		emp.add(new Student("Rohit", 55D,"FAIL"));
		emp.add(new Student("Scott", 75D,"PASS"));
		emp.add(new Student("Smith", 80D,"PASS"));
		emp.add(new Student("Babbar", 50D,"FAIL"));
		emp.add(new Student("Alen", 90D,"FAIL"));
		
		emp.stream().filter(e -> e.score()>=75).forEach(e -> System.out.println(e.name()));
		
	}
}