package day_26.bank.elc;

import day_26.bank.blc.Bank;

public class BankCustomer {

	public static void main(String[] args) {
		Bank sbi = new Bank();
		
		sbi.setCustomerDeatils("Arman", 1234567,120000);
		sbi.deposit(100000);
		sbi.withdraw(100000);
		String details = sbi.displayDetails();
		System.out.println(details);
		System.out.println();
		
		sbi.currentBalance();

	}

}
