package string;

public class StoringStringSCP 
{
	public static void main(String[] args) 
	{
		String s1 = "Java James";
		String s2 = new String("Java James").intern();
		String s3 = String.valueOf("Java James");
		String s4 = "Java " + "James";  //Compile time constant
		
		System.out.println(s1==s4);
	}

}
