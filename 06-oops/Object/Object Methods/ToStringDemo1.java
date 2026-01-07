package sunday_day_02__Objects_and_its_Methods;

class Student
{
	
}

public class ToStringDemo1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println(s1.toString());
		
		System.out.println("......................");
		
		int hashcode = s1.hashCode();
		System.out.println(Integer.toHexString(hashcode));
	}

}

// it return  getClass().getName()+"@"+Integer.toHesString(hashCode) 