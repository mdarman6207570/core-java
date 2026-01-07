package day_17__Switch_Expression;

import java.util.Scanner;

public class SwitchDemo2 
{
	public static void main(String[] args) 
	{
       System.out.println("\t\t**Main Menu**\n");
       System.out.println("\t\t**100 Police**\n");
       System.out.println("\t\t**101 Fire**\n");
       System.out.println("\t\t**102 Ambulance**\n");
       System.out.println("\t\t**139 Railway**\n");
       System.out.println("\t\t**181 Women's Helpline**\n");
       
       Scanner sc =  new Scanner(System.in);
       
       System.out.println("Enter your choice :");
       
       int choice = Integer.parseInt(sc.nextLine());
       
       switch (choice)
       {
       case 100 -> System.out.println("Police Services...");
       case 101 -> System.out.println("Fire Services...");
       case 102 -> System.out.println("Ambulance Services...");
       case 139 -> System.out.println("Railway Services...");
       case 181 -> System.out.println("Womes's Helpline...");
       default  -> System.out.println("No Valid Choice...");
       }
       sc.close();
       
       
	}

}
