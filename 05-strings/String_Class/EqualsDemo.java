package string;

public class EqualsDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Arman";
		String s2 = new String("Arman");
		
		System.out.println(s1==s2); //f
		System.out.println(s1.equals(s2)); //t
		System.out.println(s1.hashCode()); //same for s1 s2
		System.out.println(s2.hashCode()); //same for s1 s2
		
	}
}
