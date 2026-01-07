package day_67__Exception_Hierarchy;

public class ExceptionAsSuper 
{
	public static void main(String[] args) 
	{
		Exception e1 = new ArithmeticException();   //detailMessage = null
		System.out.println(e1.toString());         //java.lang.ArithmaticException

	    
		Exception e2 = new ArithmeticException("Divided by zero");
		System.out.println(e2.toString());   //java.lang.ArithmaticException : Divided by zero

	}

}
