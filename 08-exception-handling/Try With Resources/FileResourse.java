package day_71_;

public class FileResourse implements AutoCloseable
{
	
	@Override
	public void close() throws Exception 
	{
		System.out.println("File Resourse closed!!!");	
	}
	
}

