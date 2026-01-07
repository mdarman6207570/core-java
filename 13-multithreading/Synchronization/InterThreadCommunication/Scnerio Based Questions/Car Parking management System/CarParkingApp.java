package blc;

import java.util.Scanner;

public class CarParkingApp {

    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Welcome to D-Mart Parking");
        Scanner sc = new Scanner(System.in);
        ParkingGarage garage = new ParkingGarage(5);
       
        Thread []threads = new Thread[5];
       
        //Initializing the Thread array
        for(int i=0; i<threads.length; i++)
        {
            System.out.println("Enter Car name :");
            String carName = sc.nextLine();
            threads[i] = new Thread(new Car(garage, carName));    
        }
       
       
        for(Thread t : threads)
        {
            t.start();
        }
       
        Thread.sleep(1000);
        System.out.println("Parking garage simulation is complete.");    
       
        sc.close();  }
}