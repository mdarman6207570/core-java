package day_56_Overriding__MCQ;

class A19 
{
    static void test() 
    {
      System.out.println("A");
     }
}
class B19 extends A19 
{
    static void test()
    { 
      System.out.println("B"); 
    }
}

public class Test19 
{
	public static void main(String[] args) 
    {
        A19 obj = new B19();
        obj.test();
    }
}
