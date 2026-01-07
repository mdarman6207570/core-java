package day_45__Static_;

public class Example 
{
	{
        System.out.println("Instance Block");
    }

    static 
    {
        System.out.println("Static Block");
    }

    public static void show() 
    {
        System.out.println("Static Method");
       // display();  //this is non-static method
    }

    public void display() 
    {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) 
    {
        show();
    }
}
