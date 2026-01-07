package day_44_Static_Block_MCQ;

class Demo2 
{ 
  public static final int VALUE; 
 
  static 
  { 
    VALUE = 50; 
    System.out.println("Value is : " + VALUE); 
  } 
}
public class Test8 
{
	 public static void main(String[] args) 
	 { 
	 System.out.println("Main Method VALUE = " + Demo2.VALUE); 
	 } 
}
