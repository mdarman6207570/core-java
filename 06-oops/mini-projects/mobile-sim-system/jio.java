package mobile_sim;

public class jio implements SIM{

	private double balance;
	
	public void recharge(double amt){
		this.balance = this.balance + amt;
		System.out.println("jio SIM is recharged");
		currentBalance();
	}

	public void currentBalance(){
		System.out.println("jio SIM existing balance: "+ balance);
	}

	public String call(long mn){
		return "jio: The number you are dialing is currently switched off. \nPlease dial after some time";
	}
	
	public String sms(long mn, String msg){
		return "jio: Your message send successfully";
	}
}