package mobile_sim;

public class VI implements SIM {

	private double balance;
	
	@Override
	public void recharge(double amt) {
		if(amt <= 0) {
			System.out.println("Error: Invalid Amount");
			return;
		}
		
		this.balance = this.balance + amt;
		System.out.println("VI SIM is recharged");
		currentBalance();
	}

	@Override
	public void currentBalance(){
		System.out.println(
			"VI SIM current balance: "+ balance);
	}
	
	@Override
	public String call(long mn){
		if(balance<=0)
			return "Error: Low balance";
		
		return "VI: The number you are dialing is unrechable."+
				"\nPlease dial after some time";
	}

	@Override
	public String sms(long mn, String msg){
		if(balance<=0)
			return "Error: Low balance";
		
		return "VI: Your message send successfully";
	}
}