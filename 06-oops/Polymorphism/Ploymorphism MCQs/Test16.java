package day_56_Overriding__MCQ;

class A16 
{
    public void show() 
    { 
    	System.out.println("A"); 
   	}
}
class B16 extends A16 {
 /*
	protected void show()
    {
    	System.out.println("B"); 
   	}
   	*/
}

public class Test16 
{
	public static void main(String[] args) {
        A16 obj = new B16();
        obj.show();
    }	
}
