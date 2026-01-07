package day_7;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any no:");
		int n = sc.nextInt();
		if(n>99 && n<1000) {
			
		}
		else if(n==1) {
			System.out.println("number is pallindrome");
		}else if(n==0) {
			System.out.println("the number is not a pallindrome");
		}else if(n<0) {
		System.out.println(-1);
		System.out.println("-ve kindly provide the +ve number only");
		
		}else {
			System.out.println("");
		}
	  }
}
