package day_45__Static_;

public class Test1 
{
	static int x = 10;

    {
        x = 50;
    }

    static 
    {
        x = 30;
    }

    public static void main(String[] args) 
    {
        System.out.println("Before Object Creation: " + x);
        Test1 obj1 = new Test1();
        System.out.println("After Object Creation: " + x);
    }
}
