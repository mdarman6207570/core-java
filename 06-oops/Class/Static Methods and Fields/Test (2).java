package day_45__Static_;

public class Test 
{
	static 
    {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    Test() 
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main Method");
        Test obj1 = new Test();
        Test obj2 = new Test();
    }
}
