package day_18__New_Switch_Statement;

import java.util.Scanner;

public class SwitchDemo6
{
  public static void main(String args[]) 
  {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your performance grade[A/B/C] :");
	char grade = sc.next().toUpperCase().charAt(0);
	
	double salary = 40000;
	
	double bonus = switch(grade)
	{
	    case 'A'-> 
	    {
	    	System.out.println("High Level Performer");
	    	yield salary*0.2;
	    }
	    
	    case 'B'-> 
	    {
	    	System.out.println("Mid Level Performer");
	    	yield salary*0.15;
	    }
	    
	    case 'C'-> 
	    {
	    	System.out.println("Basic Bonus");
	    	yield salary*0.10;
	    }
	    default -> 0.0;
	};
	
	System.out.println("Bonus :"+ bonus);
	sc.close();
	
    }
}
