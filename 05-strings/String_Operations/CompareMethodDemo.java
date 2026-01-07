package string_methods;

public class CompareMethodDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		
		System.out.println(s1.compareTo(s2));  //0
		System.out.println(s1.compareTo(s3));  //1
		System.out.println(s3.compareTo(s1));  //-1
		
		
		String s4 = "A";
		String s5 = "a";
		
		System.out.println(s4.compareTo(s5));  //-32
		System.out.println(s5.compareTo(s4));  //32
		
		String s6 = "Ravi";
		String s7 = "Raj";
		
		System.out.println(s6.compareTo(s7));  //12
		System.out.println(s7.compareTo(s6));  //-12
	}

}
