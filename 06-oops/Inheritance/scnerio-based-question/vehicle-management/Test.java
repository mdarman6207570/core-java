package Day_43_Vehicle_Inheritance;

//import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
//		String make = sc.nextLine();
//		String model = sc.nextLine();
//		int year = Integer.parseInt(sc.nextLine());
//		int noOfGates = Integer.parseInt(sc.nextLine());
		
		Car car = new Car("Audi", "Q8", 2021, 4); 
		System.out.println("Car Details:"); 
		car.displayDetail();
		
		Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports"); 
		System.out.println("\nBike Details:"); 
		bike.displayDetail(); 
		

	}

}
