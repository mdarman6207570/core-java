package day_17__Switch_Expression;

import java.util.Scanner;

public class SwitchDemo3 
{
	public static void main(String[] args) 
	{ 
       Scanner sc =  new Scanner(System.in);
       System.out.println("Enter the language you want to learn :");
       
       String language = sc.nextLine().toUpperCase();
       
       switch (language)
       {
       case "C" -> System.out.println("you selected C language...");
       case "JAVA" -> System.out.println("you selected JAVA language...");
       case "HTML" -> System.out.println("you selected HTML language...");
       default  -> System.out.println("Language Not Supported...");
       }
       sc.close();
	}
}
