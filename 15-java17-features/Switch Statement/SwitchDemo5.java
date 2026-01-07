package day_18__New_Switch_Statement;

import java.util.Scanner;

public class SwitchDemo5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enteryour subject grade :");
		char grade = sc.next().toUpperCase().charAt(0);
		
		String result = switch(grade)
		{
		    case 'A','B' -> "Excellent";
		
		    case 'C' -> "Good";
		
	     	case 'D' -> "Average";
		
		    default -> "No Grade";
		};
		
		System.out.println("Your grade is :"+result);
		sc.close();
	}
}
