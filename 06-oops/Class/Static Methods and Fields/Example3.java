package day_45__Static_;

public class Example3 
{
	static 
    {
    	 x = m1();
      //  System.out.println(Example2.x);  //Read Only       
    }

    static int x = 100;
    
    static int m1() 
    {
    	System.out.println(x);
        x = 40;
        return x + 20;
    }

    public static void main(String[] args) 
    {
        System.out.println(x);  
    }
}