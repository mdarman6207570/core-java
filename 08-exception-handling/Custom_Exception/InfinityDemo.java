package custom_exception;

public class InfinityDemo 
{
   public static void main(String[] args) 
   {
	  
	   System.out.println(10/0.0);          //Infinity    [POSITIVE_INFINITY]
	   System.out.println(-10/0.0);         //Infinity    [NEGATIVE_INFINITY]  
	   System.out.println(0/0.0);          //NaN          [Not a number]
	   System.out.println(10/0);
	   System.out.println("Completed");
   }
}
