package day_44_Static_Block_MCQ;

class  Alpha19 
{ 
  public static final int MAX_VALUE = 100; 

  static 
  {  
    System.out.println("Static Block"); 
  } 
} 

public class Test19 
{
	 public static void main(String[] args) 
	 { 
	 System.out.println(Alpha19.MAX_VALUE); 
	 }
}
