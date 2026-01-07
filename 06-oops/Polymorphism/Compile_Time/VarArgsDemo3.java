package day_47_Overloading___Var_args;

class ArrayAndValues
{
	public void accept(int ...arr) 
	{	
		for(int x : arr)
		{
			System.out.println(x);
		}
	}
}

public class VarArgsDemo3 
{
	public static void main(String[] args) 
	{
		ArrayAndValues h = new ArrayAndValues();
		int []values = {12,90,67,45};
		h.accept(values);
		System.out.println(".................");
		h.accept(100,200,300,400,500);
	}
}
