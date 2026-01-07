package day6;
import java.util.*;

public class Q3 {
	public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);	 
         System.out.println("Enter principle Amount: ");
	     float a = sc.nextFloat();
	    
	     System.out.println("Enter rate  : ");
	     float r = sc.nextFloat();
	         
	    float totalAmount =a* ((1+r/100)*(1+r/100)*(1+r/100));
	    System.out.println("Total surface area of a cylinder is: "+ totalAmount);
	      }
	}
