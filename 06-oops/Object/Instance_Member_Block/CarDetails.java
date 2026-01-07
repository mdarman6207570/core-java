package day12.elc;

import java.util.Scanner;
import day12.blc.Car;

public class CarDetails {

	public static void main(String[] args) {
		Car car = new Car();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Car name is: ");
		String cName =sc.nextLine();
		
		System.out.println("Enter Car Model is: ");
		String cModel =sc.nextLine();
		
		System.out.println("Enter Car Age is: ");
		int cAge =Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Car Color is: ");
		String cColor =sc.nextLine();
		
		System.out.println("Enter Car Price is: ");
		double cPrice =Double.parseDouble(sc.nextLine());
		
		car.setCarData(cName, cModel, cAge, cColor, cPrice);
		
		car.getCarInfo();
		sc.close();

	}

}
