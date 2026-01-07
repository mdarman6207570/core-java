package serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveEmployeeObject 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		var fin = new FileInputStream("D:\\new\\Employee.txt");
		var ois = new ObjectInputStream(fin);
		
		try(fin; ois)
		{
			while(true)
			{
				Employee employee = (Employee) ois.readObject();
				System.out.println(employee);
			}
		}
		catch (EOFException e) 
		{
			System.err.println("End of file has reached!!!");
		}
	}

}
