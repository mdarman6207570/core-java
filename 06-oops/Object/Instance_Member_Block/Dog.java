package day22.blc;

import java.util.Scanner;

public class Dog {
		String name;
		int age;
		String color;
	
	
	//Initializing the object(Dog) properties
	public void setDogData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dog name :");
		name = sc.nextLine();
		
		System.out.println("Enter Dog age :");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Dog color :");
		color = sc.nextLine();
		sc.close();
	}

	public void getDogInformation() {
		System.out.println("Dog name is :"+name);
		System.out.println("Dog age is :"+age);
		System.out.println("Dog color is :"+color);
    }
}