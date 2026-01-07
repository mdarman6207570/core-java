package day9;

public class Q10 {
	public static void main(String[] argv)
    {
        short x = 200;

        String result = switch (x) 
        {
            case 100 -> "One hundred";
            case 200 -> "Two hundred";
         //   case 33000 -> "Thirty three thousand";    out of range  so ERROR
            default -> "Not matched";
        };

        System.out.println(result);
    }
}
