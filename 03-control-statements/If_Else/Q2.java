package day_7;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any no:");
		int n = sc.nextInt();
		if(n>0) {
			int r = n%100;
			n = n-r;
			n=n+100;
		System.out.println("Sum of no is: "+n);
		}
		else {
			System.out.println(-1);
		}
	  }
}
