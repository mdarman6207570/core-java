package day_44_Static_Block_MCQ;

class Test16 
{ 
  public static final Test16 t1 = new Test16(); //t1 = null; 

  static 
  {  
    System.out.println("static block"); 
  } 
   
  { 
    System.out.println("Non static block"); 
  } 
  
  Test16() 
  { 
    System.out.println("No Argument Constructor"); 
  } 
} 

public class Demo16 
{
	public static void main(String[] args) 
	{ 
	new Test16();   //class loading + object creation
	}
}
