package day12.blc;

public class Car {
String carName;
String carModel;
int carAge;
String carColor;
Double carPrice;

public void setCarData(String name, String model, int age, String color,Double price) {
	carName = name;
	carModel = model;
	carAge = age;
	carColor = color;
	carPrice = price;
}

 public void getCarInfo() {
	System.out.println("Car Name is :"+carName);
	System.out.println("Car Model is :"+carModel);
	System.out.println("Car Age is :"+carAge);
	System.out.println("Car Color is :"+carColor);
	System.out.println("Car Price is :"+carPrice);
	
	 
  }
}
