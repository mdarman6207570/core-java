package string;

public class InternDemo2 
{
	public static void main(String[] args) 
	{
		String s1 = "Java";
		String s2 = new String("Java");
		
		System.out.println(s1==s2); //false
		String s3 = s2.intern();
		System.out.println(s1==s2);  //f
		
		System.out.println(s1==s3); //t  
	}

}
