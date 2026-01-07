package variable_hiding;


class Father
{
	protected double balance = 50000;
}

class Son extends Father
{
	protected double balance = 18000;    //variable Hiding
	
	public void getBalance()
	{
		System.out.println("Father Balance is :"+super.balance);
		System.out.println("Father Balance is :"+this.balance);
	}
	
}



public class VariableHiding 
{
	public static void main(String[] args) 
	{
		Son son = new Son();
		son.getBalance();
	}

}
