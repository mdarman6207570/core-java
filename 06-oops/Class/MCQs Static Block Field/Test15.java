package day_44_Static_Block_MCQ;

class  Alpha15 
{ 
   public static final int A; 

   static 
   { 
     print(); 
     A = 100; 
   } 

   public static void print() 
   { 
      System.out.println("Default value :"+A); 
   } 
} 


public class Test15 
{
	 public static void main(String[] args) 
	 { 
	 System.out.println("User value :"+Alpha15.A); 
	 }
}
