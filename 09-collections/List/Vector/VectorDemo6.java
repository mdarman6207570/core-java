package vector;

import java.util.Vector;

public class VectorDemo6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Pomigranate");
		fruits.add("Apple");
		fruits.add("Papaya");
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);
			fruits.add("Pear");
		}
	}
}
