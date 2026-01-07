package day_43__Static_Block;

class Test9
{
   public static final Test9 t1 = new Test9();   //t1 = null; 	
   
   static 
   {
	   System.out.println("Static Block");
   }
   
   {
	   System.out.println("Non static block");
   }
   
   Test9()
   {
	   System.out.println("No Argument Constructor");
   }
   
}


public class StaticBlockDemo9 
{
	 public static void main(String args[])
	   {
		  new Test9();  //2 steps (class loading + Object creation)
	   }
}
