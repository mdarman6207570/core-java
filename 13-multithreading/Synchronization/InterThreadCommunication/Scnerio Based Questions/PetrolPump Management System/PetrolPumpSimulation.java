package multithreading_scenario_program;

import java.util.Scanner;

public class PetrolPumpSimulation 
{
	public static void main(String[] args) 
	{
		PetrolPump pp = new PetrolPump();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Car :");
		int noOfCar = Integer.parseInt(sc.nextLine());
		
		Car cars[] = new Car[noOfCar];
		
		Thread thread[] = new Thread[noOfCar];
		for(int i=0;i<noOfCar;i++)
		{
			System.out.println("Enter Car Name :");
			String carName = sc.nextLine();
			cars[i] = new Car(carName,pp);
			
		}
		
		
		for(int i=0;i<noOfCar;i++)
		{
			thread[i]=new Thread(cars[i]);
			thread[i].start();
			try {
				thread[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		sc.close();
	}
}
