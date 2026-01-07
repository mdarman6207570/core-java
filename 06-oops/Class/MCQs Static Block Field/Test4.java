package day_44_Static_Block_MCQ;

public class Test4 
{ 
	 
	 static 
	 { 
	   System.out.println("Static Block Executed"); 
	 } 
	 
	 static void display() 
	 { 
	   System.out.println("Static Method Executed"); 
	 }
	 
	 public static void main(String[] args) 
	 { 
	   System.out.println("Main Method Started"); 
	   display(); 
	 }
}
