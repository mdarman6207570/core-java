package day_44_Static_Block_MCQ;

public class StaticTrick9 
{
	 static StaticTrick9 obj; 
	
	 static 
	 { 
	   obj = new StaticTrick9(); 
	   System.out.println("Static block executed"); 
	 } 
	  
	 StaticTrick9() 
	 { 
	   System.out.println("Constructor executed"); 
	 }
	 
	 public static void main(String[] args) 
	 { 
	   System.out.println("Main method"); 
	 }
}
