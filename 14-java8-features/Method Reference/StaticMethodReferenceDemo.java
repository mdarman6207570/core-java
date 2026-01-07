package method_reference;

import java.util.Vector;

class EvenOrOdd
{
	public static void isEven(int n)
	{
		if (n%2==0) 
		{
			System.out.println(n+" is even");
		}
		else
		{
			System.out.println(n+" is odd");
		}
	}
}

public class StaticMethodReferenceDemo 
{
	public static void main(String[] args) 
	{
		Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(12);
        numbers.add(15);
	
        numbers.forEach(EvenOrOdd::isEven);
	}
	
}
