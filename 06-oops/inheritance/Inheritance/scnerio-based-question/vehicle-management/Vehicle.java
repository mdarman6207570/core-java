package Day_43_Vehicle_Inheritance;

public class Vehicle 
{
   protected String make;
   protected String model;
   protected int year;
   
   
   public Vehicle(String make, String model, int year)  
   {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
   }
   
   public void  displayDetails() 
   {
	  System.out.println("Make: "+make);
	  System.out.println("Model: "+model);
	  System.out.println("Year: "+year);
   }
}
