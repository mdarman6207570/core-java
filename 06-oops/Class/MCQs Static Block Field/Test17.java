package day_44_Static_Block_MCQ;

class Sample 
{ 
   static 
   { 
	   System.out.println("Static Block"); 
	   x = m1(); 
	   System.out.println(Sample.x); 
   } 
   
  public static int m1() 
  { 
     System.out.println("Static Method"); 
     return 100; 
  } 
 
  static int x; 
} 

public class Test17 
{
	public static void main(String[] args) 
	{ 
	System.out.println(Sample.x); 
	}
}
