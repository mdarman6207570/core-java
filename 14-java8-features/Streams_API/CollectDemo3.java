package stream_method;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Student(String course,Integer id,String name)
{
	
}

public class CollectDemo3 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Java", 101, "Scott");
		Student s2 = new Student("Java", 101, "Smith");
		Student s3 = new Student("Java", 101, "Samrat");
		Student s4 = new Student("HTML", 101, "Raj");
		Student s5 = new Student("HTML", 101, "Rahul");
		Student s6 = new Student("REACT", 101, "Alen");
		Student s7 = new Student("REACT", 101, "John");
		
		Map<String, List<Student>> map = Stream.of(s1,s2,s3,s4,s5,s6,s7)
				.collect(Collectors.groupingBy(Student::course));
		
		map.forEach((k,v) -> System.out.println(k+" : "+v));
	}
}
