package day_44_Static_Block_MCQ;


class  Alpha20 
{ 
  public static final int MAX_VALUE = access(); 
 
  static 
   { 
     System.out.println("Static Block"); 
   } 
    
   public static int access() 
   { 
     return 100; 
   } 
}

public class Test20 
{
	 public static void main(String[] args) 
	 { 
	 System.out.println(Alpha20.MAX_VALUE); 
	 } 
}
