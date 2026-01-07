package day9;

public class Q12 {
	public static void main(String[] argv) 
    {
        int j = 4;

        String result = switch (j) 
        {
            case 2 -> "value is two";
            case 2 + 1 -> "value is three";  
            default -> "value is " + j;
        };

        System.out.println(result);
    }
}
