package day_44_Static_Block_MCQ;


class Demo 
{ 
  { 
    System.out.println("Non Static Block in Demo"); 
  }

  public Demo() 
  { 
    System.out.println("Constructor of Demo"); 
  } 
  
  static 
  { 
    System.out.println("Static Block in Demo"); 
   } 
} 


public class Test2 
{
	 public static void main(String[] args) 
	 { 
	 Demo d1 = new Demo(); 
	 Demo d2 = new Demo(); 
	 }
}
