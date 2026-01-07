package string.mcqs;

public class Test10 
{
	public static void main(String[] args) 
    {
        String s1 = "abc";
        String s2 = s1.concat("def");
        s2 = s2.replace("a", "z");
        System.out.println(s1 + " " + s2);
    }
}
