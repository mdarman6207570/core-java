package day_17__Switch_Expression;

import java.util.Scanner;

public class SwitchDemo1 
{
	public static void main(String[] args) 
	{ 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a color char :");
       char colour = sc.next().toLowerCase().charAt(0);
       
       switch (colour)
       {
       case 'r':
    	   System.out.println("Red");
    	   break;
       case 'g':
    	   System.out.println("Green");
    	   break;
       case 'b':
    	   System.out.println("Blue");
    	   break;
       case 'w':
    	   System.out.println("White");
    	   break;
       default:
    	   System.out.println("No Colour");
       }
       System.out.println("Completed");
       sc.close();
	}

}
