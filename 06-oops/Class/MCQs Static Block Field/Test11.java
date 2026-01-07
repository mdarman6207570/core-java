package day_44_Static_Block_MCQ;

class  Alpha 
{ 
  static 
  { 
    System.out.println("A"); 
  } 
  
  { 
    System.out.println("B"); 
  } 
 
  Alpha() 
  { 
    System.out.println("C"); 
  }  
}

class Beta extends Alpha 
{ 
  static 
  {  
    System.out.println("D"); 
  } 

  { 
    System.out.println("E"); 
  } 
 
  Beta() 
  { 
    System.out.println("F"); 
  } 
}


public class Test11 
{
	 public static void main(String[] args) 
	 { 
	 new Beta(); 
	 }
}
