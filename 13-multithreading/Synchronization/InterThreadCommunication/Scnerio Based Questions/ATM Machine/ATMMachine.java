package blc;

public class ATMMachine 
{
	public static void main(String[] args) 
	{
		Account ac = new Account();
		Drawer d = new Drawer(ac);
		Depositor dep = new Depositor(ac);
		
		dep.start();
		
		try 
		{
			d.sleep(10);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		d.start();
		
	}
}
