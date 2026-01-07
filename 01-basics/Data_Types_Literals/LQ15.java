package day5;

import java.util.Scanner;

public class Q15 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter SP: ");
		int sp = sc.nextInt();
	
		System.out.print("Enter CP: ");
		int cp = sc.nextInt();
		if(sp>cp) {
			System.out.println("Profit = "+(sp-cp));
			System.out.println("Profit percentage ="+((sp-cp)/cp)*100);
		}
		else if(sp<cp) {
			System.out.println("Loss = "+(cp-sp));
			System.out.println("Loss percentage ="+((cp-sp)/cp)*100);
		}
	
		else System.out.println("No Profit   No loss");
	}	
}
