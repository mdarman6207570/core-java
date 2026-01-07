package day_56_Overriding__MCQ;

class A6
{
public static void printName()
{
System.out.println("Value-A");
}
}
class B6 extends A6
{
public static void printName()
{
System.out.println("Name-B");
}
}


public class Test38
{
   public static void main (String[] args) 
  {
     A6 a = new B6();
     a.printName();
  }
}