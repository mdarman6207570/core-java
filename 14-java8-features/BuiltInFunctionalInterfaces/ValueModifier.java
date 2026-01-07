package elc;

import java.util.Scanner;
import java.util.function.Consumer;


public class ValueModifier 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int n =Integer.parseInt(sc.nextLine());
		System.out.println("Original value: "+n);
		
		Consumer<Integer> doubleValue = a -> System.out.println("After doubling the value: "+(a*2));
	     modifyValue(n, doubleValue);
		
	     System.out.println("Enter increment val:");
	     int num = Integer.parseInt(sc.nextLine());
	     System.out.println("");
		Consumer<Integer> Increments = a -> System.out.println("After incrementing the value by "+num+":  "+(num+n));
	    modifyValue(num, Increments);
	    
	    Consumer<Integer> squaring  = a -> System.out.println("After doubling the value: "+(a*a));
	     modifyValue(n, squaring);
	     
	     sc.close();
	}

	
	public static void modifyValue(int value, Consumer<Integer> a)
	{
		a.accept(value);
		
		
	}
}

