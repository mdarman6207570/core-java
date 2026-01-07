package day_78__Thread__Methods___Join;

class OTPVerification extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Verifying OTP...");
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			System.err.println("Thread is Interrupted");
		}
		
		System.out.println("OTP Verified..");
	}
}

class BalanceCheck extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Checking account balance...");
		try
		{
			Thread.sleep(1500);
		}
		catch (InterruptedException e) 
		{
			System.err.println("Thread is Interrupted");
		}
		
		System.out.println("Sufficient Balance Available...");
	}
}

public class JoinDemo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		OTPVerification otpThread = new OTPVerification();
		BalanceCheck balanceThread = new BalanceCheck();
		
		balanceThread.start();
		otpThread.start();
		
		balanceThread.join();
		otpThread.join();
		
		//if both the threads completed successfully then only main thread will proceed.
		
		System.out.println("Initiating Money Transfer...");
		System.out.println("Transfer Successful...");
		
	}

}
