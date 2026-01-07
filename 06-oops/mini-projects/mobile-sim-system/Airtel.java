package mobile_sim;

public class Airtel implements SIM {

	private double balance;
	
	@Override
	public void recharge(double amt){
		this.balance = this.balance + amt;
		System.out.println("Airtel SIM is recharged");
		currentBalance();
	}
	@Override
	public void currentBalance(){
		System.out.println(
			"Airtel SIM existing balance: "+ balance);
	}

	@Override
	public String call(long mn){
		return "Aritel: The number you are dialing is currently busy."+
			   "\nPlease dial after some time";
	}
	
	@Override
	public String sms(long mn, String msg){
		return "Aritel: Your message sent successfully";
	}
}