package com.p1;
import java.util.*;

public class BillDisc {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter net Bill :");
				int nBill = sc.nextInt();
				
				if(nBill <5000) {
					System.out.println("Discount is 5%");
					System.out.println("Discount Amount is: "+(nBill*5/100));
					System.out.println("Amount Payable is: "+(nBill-(nBill*5/100)));
				
				}
				else if(nBill >=5000 && nBill<10000) {
					System.out.println("Discount is 10%");
					System.out.println("Discount Amount is: "+(nBill*10/100));
					System.out.println("Amount Payable is: "+(nBill-(nBill*10/100)));
				
				}
				else {
					
						System.out.println("Discount is 15%");
						System.out.println("Discount Amount is: "+(nBill*15/100));
						System.out.println("Amount Payable is: "+(nBill-(nBill*15/100)));
				}
				
			}
		}