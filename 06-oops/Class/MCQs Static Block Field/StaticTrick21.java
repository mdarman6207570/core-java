package day_44_Static_Block_MCQ;

public class StaticTrick21 
{
	 static 
	 { 
	//   System.out.println("Static block: y = " + y);  //only write can't read
	   y = 20; 
	 }
	 
	  static int y = 10; 
	 
	  public static void main(String[] args) 
	  { 
	    System.out.println("Main: y = " + y); 
	  } 
}
