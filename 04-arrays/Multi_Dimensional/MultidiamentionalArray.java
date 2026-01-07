package multidimesionalarray;

import java.util.Scanner;

public class MultidiamentionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = { 1, 2, 3, 4 }; // list of elements
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // list of list
		int arr3[][][] = { { { 1, 2, 3 }, { 4 }, { 7, 8 } }, { { 1, 2, 3 }, { 4, 5 } } }; // list of nested list

		System.out.println(arr1[1]); // 2
		System.out.println(arr2[1][1]); // 5
		System.out.println(arr3[1][1][1]); // 5

	}

}