package day_47_Overloading___Var_args;

class Additions
{
	public void addParameterValues(int ...values) 
	{
		int sum = 0;
		
		for(int value : values)
		{
			sum += value;
		}
		
		System.out.println("Sum of Parameter is :"+sum);
	}
}

public class VarArgsDemo2 
{
	public static void main(String[] args) 
	{
		Additions a = new Additions();
		a.addParameterValues(0);
		a.addParameterValues(10);
		a.addParameterValues(10,20);
		a.addParameterValues(10,20,30);
		a.addParameterValues(10,20,30,40);
		a.addParameterValues(10,20,30,40,50);
	}
}
