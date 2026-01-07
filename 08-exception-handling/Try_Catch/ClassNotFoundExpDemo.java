package day_71_Basic_Exception;

import java.util.Scanner;

public class ClassNotFoundExpDemo 
{
	public ClassNotFoundExpDemo(String className) 
	{
		try 
		{
		    Class.forName(className); // Attempt to load class
		    System.out.println("Class loaded successfully: " + className);
		}
		catch (ClassNotFoundException e) 
		{
		    System.out.println("Error: Class '" + className + "' not found.");
		    e.printStackTrace();
		}

		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	     String a = sc.nextLine();
	     ClassNotFoundExpDemo c = new ClassNotFoundExpDemo(a);
	     
	}

}
