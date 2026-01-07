package blc;

public class Account 
{
	 private int balance = 0; 
	 
	 public synchronized void withdraw(int amount)
	 {
		 while(amount>balance)
		 {
			 System.err.println("Insuffiecient Balance!!!   Wait foe deposit");
			 try {
				wait();
			 } catch (InterruptedException e) {
				
				e.printStackTrace();
			 }
		 }
		 
		 balance -= amount;
		 System.out.println("updated balance in after withdraw: "+balance);
		 notify();
	 }
	 
	 
	 public synchronized void deposit(int amount)
	 {
		 balance += amount;
		 System.out.println("updated balance after deposit: "+balance);
		 notify();
	 }
}


