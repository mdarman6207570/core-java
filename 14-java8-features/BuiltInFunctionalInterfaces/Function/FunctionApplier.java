package elc;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= Integer.parseInt(sc.nextLine());
		
		Function<Integer,Integer> add5 = a -> a+5;
		System.out.println("After adding 5: "+applyFunction(n,add5));
		
		Function<Integer,Integer> multiplyBy2 = a -> a*2;
		System.out.println("After multiplying by 2: "+applyFunction(n,multiplyBy2));
		
		Function<Integer,Integer> subtracting3 = a -> a-3;
		System.out.println("After subtracting 3: "+applyFunction(n,subtracting3));
		sc.close();
	}

	public static int applyFunction(int value,  Function<Integer, Integer> fun)
	{
		return fun.apply(value);
	}
}
