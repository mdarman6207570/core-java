package day_26.bank.blc;

public class Bank {
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	
	 static String bankName = "SBI Hyderabad";
	 static String bankAddress = "Ameerpet";
	 static String bankIFSCCode = "SBIN0015";
	
	
	public void setCustomerDeatils(String name,int accNumber,double balance) {
		customerName = name;
		accountNumber = accNumber;
		currentBalance = balance;
	}
	
	public void withdraw(double amount) {
	   	if(amount > currentBalance) {
	   		System.err.println("You have insufficient balance");
	   	}else {
	   		currentBalance -=amount; 
	   	}
	   		
	}
	
	public void deposit(double amount) {
	   	if(amount <= 0) {
	   		System.err.println("can't deposit money zero or less than Zero");
	   		System.exit(0);
	   	}else {
	   		currentBalance +=amount;
	   	}
   	}
	
	
	public void currentBalance() {
		System.out.println("Current balance: "+currentBalance);
	}

	
	public String displayDetails() {
		return "customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance +", bankName ="+bankName +", bankAddress ="+bankAddress+", bankIFSCCode="+bankIFSCCode;
	}

	
	
	
	
}
