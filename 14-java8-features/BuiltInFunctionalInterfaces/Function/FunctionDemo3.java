package day_63_Predefined_Functional_Interface;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo3
{
	public static void main(String[] args) 
	{
		//verify whether my name starts with A or not
		
		Function<String,Boolean> fn3 = name -> name.startsWith("A") ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.nextLine();
		
		System.out.println("Your name starts with 'A' "+fn3.apply(name));
		sc.close();
	}

}
