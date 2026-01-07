package day9;

public class Q14 {
	public static void main(String[] argv) 
    {
    	int score = 85;
    	String grade = switch (score / 10) 
    	{
    	    case 10, 9 -> "A";
    	    case 8 -> 
    	    {
    	        System.out.println("Great job!");
    	        yield "B";
    	    }
    	    case 7 -> "C";
    	    default -> "F";
    	};
    	System.out.println("Grade: " + grade);
    }
}
