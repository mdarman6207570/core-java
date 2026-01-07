package day_45__Static_;

public class Test53 
{
	int x = 10; 
	public static void main(String[] args) 
	{ 
	 // System.out.println(x); //Invalid
	} 
	
	static
	{ 
	  Test53 t = new Test53();	
	  System.out.print(t.x + " "); 
	} 
	}
