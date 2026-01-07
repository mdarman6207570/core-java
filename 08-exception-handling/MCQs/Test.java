package mcq;

import java.io.FileNotFoundException;
public class Test
{
       public static void main(String[] argv) throws Exception 
       {
             try 
             {
                    throw new FileNotFoundException("");
             } 
	      catch (FileNotFoundException ex) 
              {
                    System.out.println("book list not found!");
                    throw ex;
              }
       }
}