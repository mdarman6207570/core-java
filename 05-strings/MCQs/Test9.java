package string.mcqs;

public class Test9 
{
	public static void main(String[] args) 
    {
        String s1 = "Java";
        String s2 = "J" + "ava";
        String s3 = new String("Java");
        System.out.println((s1 == s2) + " " + (s1.equals(s3)));
    }
}
