package io;

import java.io.File;
import java.io.IOException;

public class FileCreation 
{
	public static void main(String[] args) 
	{
		File file = new File("D:\\new\\Hello.txt"); 
		
		try 
		{
			if(file.exists()) 
			{
				System.out.println(file.getName()+" is available");
			}
			else
			{
				System.err.println(file.getName()+" is not available");
			}
			
			System.out.println("........................");
			
			if(file.createNewFile())
			{
				System.out.println(file.getName()+" has created successfully!!!");
			}
			else
			{
				System.err.println(file.getName()+" is already existing");
			}
			
		}
		catch (IOException e) 
		{
		   	e.printStackTrace();
		}
	}

}
