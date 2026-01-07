package constructor_method_reference;

import java.util.function.Function;

class Student
{
	private String name;
	
	public Student(String name)
	{
		this.name=name;
	}

	@Override
	public String toString() 
	{
		return "Student [name=" + name + "]";
	}
	
	
}

public class ConstrucotorMethodReferenceDemo2 
{
	public static void main(String[] args)
	{
		Function<String,Student> fn1 = Student::new;
		Student student = fn1.apply("Ravi");
		System.out.println(student);
	}
}
