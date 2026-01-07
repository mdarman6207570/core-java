package com.p1;

import java.util.*;
public class Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Days :");
		int days = sc.nextInt();
		
		int yr = days/365;
		int months = days%365/30;
		int day = days%365%30;
		
     System.out.println(yr+" :Years-- "+months+" :months-- "+day+" :days");
	}

}
