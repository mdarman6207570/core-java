package com.p1;

import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter amount :");
		int principalAmount = sc.nextInt();
		
		System.out.println("Enter rate :");
		int rate = sc.nextInt();
		
		System.out.println("Enter time :");
		int time = sc.nextInt();

		int sInterest = (principalAmount * rate * time)/100;
		
		System.out.println("Simple Interest is : "+sInterest);
		System.out.println("Amount is : "+principalAmount);
		
		
	}
}
