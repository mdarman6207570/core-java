package day_56_Overriding__MCQ;

class A18 
{
    void show() 
    {
      System.out.println("A"); 
     }
}
class B18 extends A18 
{
    void show() 
    {
      System.out.println("B"); 
    }

    void print() 
    {
      super.show();
    }
}

public class Test18 
{
	public static void main(String[] args)
    {
        B18 obj = new B18();
        obj.print();
    }
}
