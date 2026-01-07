package sorted;

import java.util.Arrays;
import java.util.List;

record Student(Integer id,String name)
{
	
}

public class SortedDemo3 
{
	public static void main(String[] args) 
	{
		List<Student> students = Arrays.asList(
            new Student(3, "Scott"),
            new Student(1, "John"),
            new Student(2, "Alen")
		);
		
		students.stream().sorted((s1,s2) -> Integer.compare(s1.id(), s2.id())).forEach(System.out::println);
	}
}
