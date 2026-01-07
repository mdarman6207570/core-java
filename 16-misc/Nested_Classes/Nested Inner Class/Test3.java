package innerclass;

class MyOuter3
{
   private int x = 25;
   
   class MyInner
   {
	   public void seeOuter()
	   {
		   System.out.println("Outer x is "+x);
	   }
   }
}

public class Test3 
{
	public static void main(String[] args) 
	{
		MyOuter3.MyInner m = new MyOuter3().new MyInner();
		m.seeOuter();
	}
}
