package day_44_Static_Block_MCQ;

class AA 
{ 
static 
{ 
System.out.println("Class A static block"); 
} 
} 


public class StaticTrick22 
{
	 static 
	 { 
	 System.out.println("Class StaticTrick static block"); 
	 } 
	 public static void main(String[] args) 
	 { 
	 System.out.println("Main method"); 
	 }
}
