package optional_demo;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo4 
{
	public static void main(String[] args) 
	{
		ArrayList<Optional<String>> listOfCity = new ArrayList<>();
		listOfCity.add(Optional.of("Hyd"));
		listOfCity.add(Optional.of("Bglr"));
		listOfCity.add(Optional.of("Pune"));
		listOfCity.add(Optional.of("BBSR"));
		listOfCity.add(Optional.empty());
		
		for(Optional<String>optn1 : listOfCity)
		if(optn1.isPresent())
		{
			System.out.println(optn1.get());
		}
		else
		{
			System.err.println("No Value is available in the container");
		}
	}

}
