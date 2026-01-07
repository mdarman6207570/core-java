package string;

import java.util.Scanner;

public class Reverse2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);

		sc.close();
		

	}

}
