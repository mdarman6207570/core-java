package day_56_Overriding__MCQ;

class Parent 
{
    Parent() 
    {
        show();
    }
    void show()
    {
        System.out.println("Parent show");
    }
}

class Child extends Parent
{
    int x = 10;
    @Override
    void show() 
    {
        System.out.println("Child show, x = " + x);
    }
}


public class Test 
{
	public static void main(String[] args) 
    {
        new Child();
    }
}
