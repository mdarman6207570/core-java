package mcq;

import java.io.FileNotFoundException;
public class a60
{
	public static void main(String[] argv)  
    {
          try 
          {
                 throw new FileNotFoundException("");
          } 
			 catch (FileNotFoundException ex) 
           {
                 System.out.println("book list not found!");
                // throw ex;
           }
    }
}