package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class StoreEmployeeObject 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		var fout = new FileOutputStream("D:\\new\\Employee.txt");
		var oos = new ObjectOutputStream(fout);
		
		try(sc;fout;oos)
		{
			System.out.println("How many employee Object :");
			int noOfObj = Integer.parseInt(sc.nextLine());
			
			for(int i=1;i<=noOfObj;i++)
			{
				Employee employee = Employee.getEmployeeObject();
				oos.writeObject(employee);
			}
			System.out.println("Object stored successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
