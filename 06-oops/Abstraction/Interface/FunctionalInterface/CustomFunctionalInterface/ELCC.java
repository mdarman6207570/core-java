package day_61_Functional_Programming_Lambda_Expression;
@FunctionalInterface
interface Printablee
{
	void print();
}

public class ELCC 
{
	public static void main(String ...args) 
	{
		Printablee p = () -> System.out.println("Printingg");
		p.print();
	}
}


//Lambda Expression
