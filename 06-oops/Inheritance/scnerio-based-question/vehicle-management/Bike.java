package Day_43_Vehicle_Inheritance;

public class Bike extends Vehicle 
{
	 protected String type;

	
	 
	 public Bike(String make, String model, int year, String type) 
	 {
		super(make, model, year);
		this.type = type;
	}



	 public void  displayDetail() 
	 {
		  super.displayDetails();
		  System.out.println("Type: "+type);
	 }
	}