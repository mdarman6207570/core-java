package day9;

public class Q9 {
	public static void main(String[] argv) 
    {
    	int day = 3;
    	String result = switch(day)
    	{
    	    case 1, 2 -> "Weekday";
    	    case 3, 4, 5 -> "Midweek";
    	    case 6, 7 -> "Weekend";
    	    default -> "Invalid";
    	};
    	System.out.println(result);
    }
}
