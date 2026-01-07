package day_60__Abstract_class_and_abstract_method_Scenario;

public class Testing 
{
	public static void main(String[] args) 
	{
	    Shape shape = null;
	    
	    shape = new Rectangle(30.3, 45.4);
	    shape.printDetails();
	    
	    System.out.println("....................");
	    
	    shape = new Circle(23.2);
	    shape.printDetails();
	    
	    System.out.println("......................");
	    
	    shape = new Triangle(146.2, 40.0);
	    shape.printDetails();
	}

}
