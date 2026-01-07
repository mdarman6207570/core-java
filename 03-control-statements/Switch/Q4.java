package day9;

public class Q4 {
	 public static void main(String[] args) 
	    {
	        byte b = 127;
	        String result = switch (b) 
		{
	            case 23 -> "Matched 23";
	       //     case 128 -> "Matched 128";      error because 128 out of range
	            default -> "Not matched";
	        };
	        System.out.println(result);
	    }
}
