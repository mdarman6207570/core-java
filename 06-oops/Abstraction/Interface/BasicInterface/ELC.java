package day_60_Interface_Advance_Cocept;

public class ELC 
{
	public static void main(String[] args) 
	{
		double sum = Calculator.doSum(12, 24);
		System.out.println("Sum is :"+sum);
		
		double square = Calculator.getSquare(9);
		System.out.println("Square is :"+square);
	}
}
