package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		var fin = new FileInputStream("D:\\new\\Hyd.text");
		
		try(fin)
		{
			int i;
			while(true)
			{
				i = fin.read();
				System.out.print((char)i);
				if(i==-1)
					break;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
