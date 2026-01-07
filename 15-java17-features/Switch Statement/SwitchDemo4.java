package day_18__New_Switch_Statement;

import java.util.Scanner;

public class SwitchDemo4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an animal name :");
		String animal = sc.nextLine().toLowerCase();
		
		switch(animal)
		{
		case "dog","cat","cow","sheep" -> System.out.println("Domestic Animal");
		
		case "lion","tiger","elephant" -> System.out.println("Wild Animal");
		
		default -> System.out.println("Animal is not specified");
		}
		sc.close();
	}

}
