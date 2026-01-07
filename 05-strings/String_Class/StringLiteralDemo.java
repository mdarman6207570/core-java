package string;

public class StringLiteralDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println(s1==s2);
		
		System.out.println("...............");
		
		String s3 = "India";
		String s4 = "India";
		System.out.println(s3==s4);
		
		System.out.println("................");
		
		String s5 = new String("India");
		String s6 = new String("India");
		System.out.println(s5==s6);
		
	}

}
