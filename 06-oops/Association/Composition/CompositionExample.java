package day_46_Polymorphism;

class Engine 
{ 
  void start() 
  { 
    System.out.println("Engine started."); 
  } 
} 

class Carr 
{ 
  private Engine engine; 
  Carr() 
  { 
     engine = new Engine();  //Engine is created inside Car 
  } 
  void startCar() 
  { 
     engine.start(); 
     System.out.println("Car started."); 
  } 
}

public class CompositionExample 
{
	public static void main(String[] args) 
	{ 
	Carr car = new Carr(); 
	car.startCar(); 
	}
}
