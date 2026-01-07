package typeparameter;

import java.util.Scanner;

interface Predictable2<T>
{
	boolean test(T x);
}

public class FunctionalDemo2 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		//verify a number is even or odd
	    Predictable2<Integer> p1 = x -> x%2==0;
	    System.out.println("Enter a number to verify whether even OR odd : ");
	    int num = Integer.parseInt(sc.nextLine());
	    System.out.println(num+" is Even ? "+p1.test(num));
	    
	    //Verify whether my name is Arman OR not
	    Predictable2<String> p2 = str -> str.equals("Arman");
	    System.out.println("Enter your name : ");
	    String name = sc.nextLine();
	    System.out.println("Are you Arman  ? "+p2.test(name));
	    
	    
		
	    sc.close();
	}

}
