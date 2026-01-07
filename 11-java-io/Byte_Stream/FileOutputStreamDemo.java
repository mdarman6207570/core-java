package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo
{
	public static void main(String[] args) throws FileNotFoundException 
	{
	   var fout = new FileOutputStream("D:\\new\\Hyd.text");
	   
	   
	   try(fout)
	   {
		   String data = "Hyderabad is a nice city, It is an IT & Biryani city";
		   byte[] bytes = data.getBytes();
		   
		   fout.write(bytes);
		   System.out.println("Data stored successfully");
	   }
	   catch(IOException e)
	   {
		   e.printStackTrace();
	   }
	}

}
