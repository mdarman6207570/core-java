package basic_exception;

import java.util.Scanner;
public class ArrayIndexExceptionDemo 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[2];
		a[0] = 10;
		a[1] = 20;
		
		try {
		System.out.println("Enter a no :");
		int num = sc.nextInt();
		
		System.out.println(a[num]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println("You tried to access an invalid array index. Please check the index range.");
			e.printStackTrace();
		}
	}

}
