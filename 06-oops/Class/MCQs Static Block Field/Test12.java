package day_44_Static_Block_MCQ;

class Demo12 
{ 
	
  static 
  { 
    i = 100; 
  } 
  static int i; 
} 

public class Test12 
{
	 public static void main(String[] args) 
	 { 
	 System.out.println(Demo12.i); 
	 }
}
