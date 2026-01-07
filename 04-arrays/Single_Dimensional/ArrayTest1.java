package singledimesional__customarray;

import java.util.Arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
//  APPROACH - 1 (Iterating array using for loop) 
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
//APPROACH - 2 (Iterating array using for-each loop) 
		for (int i : arr)
			System.out.print(i + " ");
//   APPROACH - 3 (Printing array using Arrays.toString() method) 
		System.out.println(Arrays.toString(arr));
	}
}