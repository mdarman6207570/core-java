package day_44_Static_Block_MCQ;


class Demo13 
{ 
  static 
  { 
    i = 100; 
   // System.out.println(i);  //only write can't read 
  } 
  static int i; 
} 

public class Test13 
{
	 public static void main(String[] args) 
	 { 
	 System.out.println(Demo13.i); 
	 }
}
