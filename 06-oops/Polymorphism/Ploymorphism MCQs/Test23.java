package mcq;

class A23 
{
     private void printName()
     {
        System.out.println("Value-A");
     }
}
class B23 extends A23
{
   public void printName()
   {
      System.out.println("Name-B");
   }
}

public class Test23 
{
	public static void main (String[] args) 
	{
	A23 b = new B23();
	//b.printName();    it is private  Visibility Reduced so Compile time ERROR
	}
}
