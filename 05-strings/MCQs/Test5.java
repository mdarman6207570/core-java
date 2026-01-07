package string.mcqs;

public class Test5 
{
	public static void main(String[] args)
    {
        String s1 = new String("OCP");
        String s2 = s1.intern();
        String s3 = "OCP";
        System.out.println(s2 == s3);
    }
}
