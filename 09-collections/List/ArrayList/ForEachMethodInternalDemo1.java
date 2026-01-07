package collection_intro;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo1 
{
	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Kolkata");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Mumbai");
		
		//Anonymous inner class
		Consumer<String> cons = new Consumer<String>() 
		{

			@Override
			public void accept(String city) 
			{
				System.out.println(city);
				
			}
			
		};
		
		listOfCity.forEach(cons);
	}

}
