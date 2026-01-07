package Day_43_Vehicle_Inheritance;

public class Car extends Vehicle 
{
 protected int numberOfDoors;

 public Car(String make, String model, int year, int numberOfDoors) 
 {
	super(make, model, year);
	this.numberOfDoors = numberOfDoors;
 }
 
 public void  displayDetail() 
 {
	  super.displayDetails();
	  System.out.println("Number of Doors: "+numberOfDoors);
 }
}
