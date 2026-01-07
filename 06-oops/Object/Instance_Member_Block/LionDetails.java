package day12.elc;

import java.util.Scanner;

import day12.blc.Lion;



public class LionDetails {

	public static void main(String[] args) {
    Lion lion = new Lion();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Lion name is: ");
		String lName =sc.nextLine();
		
		
		System.out.println("Enter Lion Age is: ");
		int lAge =Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Lion Color is: ");
		String lColor =sc.nextLine();
		
		System.out.println("Enter Lion Price is: ");
		double lPrice =Double.parseDouble(sc.nextLine());
		
		lion.setLionData(lName, lAge, lColor, lPrice);
		
		lion.getLionInfo();
		sc.close();


	}

}
