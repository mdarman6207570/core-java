package com.p1;

public class TvPrice {

	public static void main(String[] args) {
		int tvPrice = 32500;
		int profit = (tvPrice*27)/100;
		double VAT  = (tvPrice*12.7)/100;
		double sCharge = (tvPrice*3.87)/100;

		double total  = tvPrice + profit + VAT + sCharge;
		System.out.println("Total Selling Price : "+total);
		System.out.println("Profit : "+profit);
		System.out.println("Service charge : "+sCharge);
	}
}
