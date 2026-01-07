package string_methods;

public class BlankMethod 
{
	public static void main(String[] args) 
	{
		String s1 = "";
		String s2 = "  ";
		String s3 = "\n\t";
		String s4 = "Hello";
		
		System.out.println(s1.isBlank());   //true
		System.out.println(s2.isBlank());   //true
		System.out.println(s3.isBlank());   //true
		System.out.println(s4.isBlank());   //false

	}

}