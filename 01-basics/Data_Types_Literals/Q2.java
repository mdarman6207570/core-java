package day6;
import java.util.*;

public class Q2 {
	public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter radius of cylinder: ");
         float r = sc.nextFloat();
         
         System.out.println("Enter hight of cyclinder : ");
         float h = sc.nextFloat();
         
         final float pi = 3.14f;
         float total = 2*pi*r*r  + 2*pi*r*h;
           System.out.println("Total surface area of a cylinder is: "+ total);
      }
}
