

import java.util.Scanner;

public class ApplicableCreditCard{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter your civil Score :");
        int creditPoint = Integer.parseInt(sc.nextLine());
        
        Customer cust = new Customer(name, creditPoint);
        
        CardType offeredCard = CardsOnOffer.getOfferedCard(cust);
        System.out.println(offeredCard);
		
	}

}


