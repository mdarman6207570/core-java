package day_56_Overriding__MCQ;

class Parent2
{
    Parent2() 
    {
        show();
    }
    void show() 
    {
        System.out.println("Parent show");
    }
}

class Child2 extends Parent2 {
    int a = 20;

    Child2() 
    {
        a = 30;
    }

    @Override
    void show() 
    {
        System.out.println("Child show, a = " + a);
    }
}

public class Test12 
{
	public static void main(String[] args) {
        new Child2();
    }
}
