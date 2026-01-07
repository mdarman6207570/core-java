package day_61_Functional_Programming_Lambda_Expression;

interface Printable
{
	void print();
}

public class ELC 
{
	public static void main(String ...x) 
	{
		Printable p = new Printable() {
			@Override
			public void print()
			{
				System.out.println("Printing");
			}
		};
		p.print();
	}
}
