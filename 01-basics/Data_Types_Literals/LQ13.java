package day5;

import java.util.*;
public class LQ13 {
	public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
  
  // Taking input as strings
     System.out.print("Enter the first floating-point number: ");
     String firstInput = scanner.nextLine();

     System.out.print("Enter the second floating-point number: ");
     String secondInput = scanner.nextLine();

     // Converting strings to double
     double num1 = Double.parseDouble(firstInput);
     double num2 = Double.parseDouble(secondInput);

     // Multiplying the numbers
     double result = num1 * num2;

     // Displaying the result
     System.out.println("The result of multiplication is: " + result);
     scanner.close();
    }
}
