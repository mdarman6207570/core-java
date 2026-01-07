package day9;

public class Q8 {
	public static void main(String[] argv) 
    {
        int x = 2;

        String result = switch (x) 
        {
            case 2, 4, 6, 8, 10 -> "x is an even number";
            default -> "value not handled";
        };

        System.out.println(result);
    }
}
