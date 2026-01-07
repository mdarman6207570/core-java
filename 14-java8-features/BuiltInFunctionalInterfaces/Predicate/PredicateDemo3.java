package day_63_Predefined_Functional_Interface;

import java.util.Scanner;
import java.util.function.Predicate;


public class PredicateDemo3 
{
	public static void main(String[] args) 
	{
		//verify whether my name is Arman or not
		
		Predicate<String> p3 = str -> str.equals("Arman");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		
		System.out.println("Are you Arman :"+p3.test(name));
		sc.close();
	}

}
