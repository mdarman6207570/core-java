package day_37__Inheritance_Question;

class Parent 
{
    public void show() 
    { 
      System.out.println("Parent");
    }
}
class Child extends Parent 
{
    public void show() 
    { 
       System.out.println("Child"); 
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Child obj = new Child();
        obj.show();
    }
}