package day_73;

import java.io.EOFException;

class Super
{
	public void show() throws EOFException 
	{
		System.out.println("Super class method not throwing checked Exception");
	}
}

class Sub extends Super
{
	@Override
	public void show() throws EOFException
	{
		System.out.println("Sub class method not throwing checked Exception");
	}
}

public class MethodOverridingWithChecked 
{
	public static void main(String[] args) 
	{
		
	}

}
