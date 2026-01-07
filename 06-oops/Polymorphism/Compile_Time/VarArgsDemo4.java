package day_47_Overloading___Var_args;

class Hetro
{
	public void acceptHetroData(Object ...values) 
	{	
		for(Object  value : values)
		{
			System.out.println(value);
		}
	}
}

public class VarArgsDemo4 
{
	public static void main(String args[])
	{
		Hetro h = new Hetro();
		h.acceptHetroData(12,'A',56.90,new String("Java"));
	}
}
