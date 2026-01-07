package day_44_Static_Block_MCQ;


class A 
{ 
   static 
   { 
     System.out.println("Class A Static Block"); 
   } 
}

class B extends A 
{ 
  static 
  { 
    System.out.println("Class B Static Block"); 
  } 
} 


public class Main 
{
	 public static void main(String[] args) 
	 { 
	 B obj = new B(); 
	 System.out.println("Main Method"); 
	 }
}
