package day9;

public class Q6 {
	public static void main(String[] argv) 
    {
        int temp = 90;

        String result = switch (temp) 
        {
            case 80 -> "80";
        //    case 80 -> "90";         error because duplicate value
            default -> "default";
        };

        System.out.println(result);
    }
}
