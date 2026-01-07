package threadgroup;

class Tatkal implements Runnable
{

	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" has booked the ticket under Tatkal Scheme");
	}
	
}

class PremiumTatkal implements Runnable
{

	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" has booked the ticket under PremiumTatkal Scheme");
	}
	
}

public class ThreadGroupDemo2 
{
	public static void main(String[] args) 
	{
		ThreadGroup tatkal = new ThreadGroup("Tatkal");
		ThreadGroup premiumTatkal = new ThreadGroup("Premium Tatkal");
		
		Thread t1 = new Thread(tatkal,new Tatkal(),"Scott");
		t1.start();
		
		Thread t2 = new Thread(premiumTatkal,new PremiumTatkal(),"Alen");
		t2.start();
		
		Thread t3 = new Thread(premiumTatkal,new PremiumTatkal(),"Ravi");
		t3.start();
	}

}
