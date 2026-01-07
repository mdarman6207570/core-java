package day_63_Predefined_Functional_Interface;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo2
{
	public static void main(String[] args) 
	{
		//find the length of the given city
		
		Function<String,Integer> fn1 = city -> city.length() ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city :");
		String city = sc.nextLine();
		
		System.out.println("Length of "+city+" is "+fn1.apply(city));
		sc.close();
	}

}
