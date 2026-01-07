package string_methods;

import java.util.Scanner;
import java.util.function.Predicate;

public class EqualsMethodDemo 
{
	public static void main(String[] args) 
	{
		  Predicate<String> p1 = str -> str.equals("Ravi");

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your Name: ");
	        String name = sc.nextLine();

	        System.out.println("Are you Ravi? " + p1.test(name));
	
	  sc.close();
	}

}
