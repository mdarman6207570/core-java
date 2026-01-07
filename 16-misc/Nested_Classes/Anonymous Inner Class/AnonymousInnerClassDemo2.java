package day_57__Annoymous_Inner_Class;

abstract class Loan
{
	public abstract void applyLoan();
}

public class AnonymousInnerClassDemo2 
{
	public static void main(String[] args) 
	{
		Loan carLoan = new Loan()
		{
			@Override
			public void applyLoan() 
			{
				System.out.println("Apply for car loan");
			}
		};
		
		
		Loan BikeLoan = new Loan()
		{
			@Override
			public void applyLoan() 
			{
				System.out.println("Apply for Bike loan");
			}
		};
		
		carLoan.applyLoan();
		BikeLoan.applyLoan();		
	}

}
