package day_63_Predefined_Functional_Interface;

import java.util.Scanner;
import java.util.function.Predicate;


public class PredicateDemo2 
{
	public static void main(String[] args) 
	{
		//verify whether my name is starts with 'A' or not
		
		Predicate<String> p2 = str -> str.startsWith("A");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name = sc.nextLine();
		
		System.out.println("Does the name :"+name+" start with 'A' :"+p2.test(name));
		
		sc.close();
	}
}
