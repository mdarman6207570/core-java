package vector;

import java.util.Iterator;
import java.util.Vector;

class Concurrent extends Thread
{
	private Vector<String> listOfFruit;
	
	public Concurrent(Vector<String> listOfFruit) 
	{
		super();
		this.listOfFruit = listOfFruit;
	}
	
	@Override
	public void run() 
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		listOfFruit.add("Pear");
	}
}

public class VectorDemo5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Pomigranate");
		fruits.add("Apple");
		fruits.add("Papaya");
		
		Concurrent concurrent = new Concurrent(fruits);
		concurrent.start();
		
		Iterator<String>iterator = fruits.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			Thread.sleep(500);
		}
	}

}
