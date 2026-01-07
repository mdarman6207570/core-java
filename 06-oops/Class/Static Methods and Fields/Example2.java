package day_45__Static_;

public class Example2 
{
	int value = 50;

    public static void main(String[] args) 
    {
        Example2 obj = getInstance();
        System.out.println(obj.value);  
    }

    public static Example2 getInstance() 
    {
        return new Example2();
    }
}
