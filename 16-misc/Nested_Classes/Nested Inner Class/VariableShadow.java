package innerclass;

class Outer3
{
	private int x = 100;
	
	public class Inner
	{
		private int x = 200;
		public void access()
		{
			System.out.println("Inner class c variable is :"+this.x);
			System.out.println("Inner class c variable is :"+Outer3.this.x);
		}
	}
}


public class VariableShadow 
{
   public static void main(String[] args) 
	{
		
		Outer3.Inner in = new Outer3().new Inner();   //Inner class Object
	    in.access();
	}
}
