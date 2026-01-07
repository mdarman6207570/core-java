package day_63_Predefined_Functional_Interface;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo1 
{
	public static void main(String[] args) 
	{
		//find the cube of a given number
		
		Function<Integer,Integer> fn1 = num -> num*num*num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int no = Integer.parseInt(sc.nextLine());
		
		System.out.println("Cube of "+no+" is "+fn1.apply(no));
		sc.close();
	}

}
