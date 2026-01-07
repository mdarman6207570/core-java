package day9;

public class Q13 {
	 public static void main(String[] args) 
	    {
	        for (int i = 0; i <= 5; i++) 
		{
	            String result = switch (i) 
		    {
	                case 0 -> "i is 0";
	                case 1 -> "i is 1";
	                case 2 -> "i is 2";
	                default -> "i is greater than 2";
	            };
	            System.out.println(result);
	        }
	    }
}
