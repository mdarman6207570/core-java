package day_44_Static_Block_MCQ;

class X 
{ 
	static 
	{ 
	  System.out.println("Class X Static Block"); 
	} 
}

class Y extends X 
{ 
	static 
	{ 
	  System.out.println("Class Y Static Block"); 
	} 
}

public class Tes3 
{
	 public static void main(String[] args) 
	 { 
	 X obj1 = new X(); 
	 Y obj2 = new Y(); 
	 Y obj3 = new Y(); 
	 } 
}
