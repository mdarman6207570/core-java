package day_63_Predefined_Functional_Interface;

import java.util.Scanner;
import java.util.function.Predicate;


public class PredicateDemo1 
{
	public static void main(String[] args) 
	{
		//verify whether a person is more than 18 or not
		
		Predicate<Integer> p1 = age -> age>=18;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int myAge = Integer.parseInt(sc.nextLine());
		
		System.out.println("Are you eligible for voting :"+p1.test(myAge));
		
		sc.close();
	}
}
