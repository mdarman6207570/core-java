package singledimesional__customarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
// Array using new keyword 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " Integer elements int array");
//reading elements and storing into the array    
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
// APPROACH - 1 (Iterating array using for loop) 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
//APPROACH - 2 (Iterating array using for-each loop) 
		for (int i : arr) {
			System.out.print(i + " ");
//APPROACH - 3 (Printing array using Arrays.toString() method) 
			System.out.println(Arrays.toString(arr));
		}
	}
}