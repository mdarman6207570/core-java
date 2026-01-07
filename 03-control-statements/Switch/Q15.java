package day9;

public class Q15 {
	public static void main(String[] argv) 
    {
	        String s = "xyz";

	        String result = switch (s.length()) 
	        {
	            case 1 -> "length is one";
	            case 2 -> "length is two";
	            case 3 -> "length is three";
	            default -> "no match";
	        };

	        System.out.println(result);
    }
}
