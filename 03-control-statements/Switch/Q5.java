package day9;

public class Q5 {
	public static void main(String[] argv) 
    {
        final int a = 1;
        final int b = 2;  

        int x = 0;
        String result = switch (x) 
	{
            case a -> "Matched a";
            case b -> "Matched b";
            default -> "No match";
        };

        System.out.println(result);
    }
}
