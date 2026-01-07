package day9;

public class Q7 {
	public static void main(String[] argv) 
    {
        int x = 1;

        
        String result = switch (x) 
	{
            case 1 -> 
	    {
                System.out.println("x is one");
                yield "Matched case 1";
            }
            case 2 -> 
	    {
                System.out.println("x is two");
                yield "Matched case 2";
            }
            case 3 -> 
	    {
                System.out.println("x is two");
                yield "Matched case 3";
            }
            default -> 
	    {
                System.out.println("Unknown value");
                yield "default";
            }
        };

        System.out.println("out of the switch");
        System.out.println("Result: " + result);
    }
}
