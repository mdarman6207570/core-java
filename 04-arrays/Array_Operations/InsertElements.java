package arrays_operations;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElements {
	public static int[] insertEle(int arr[], int ele) {
		int[] copyOf = Arrays.copyOf(arr, arr.length + 1);
		copyOf[copyOf.length - 1] = ele;
		return copyOf;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 }; // 1000x
		System.out.println("Before : " + Arrays.toString(arr));
		System.out.println("how many elements wants to insert");
		int n = sc.nextInt(); // 3
		System.out.println("Enter " + n + " elements ");
		for (int i = 1; i <= n; i++) {
		}
		arr = insertEle(arr, sc.nextInt());
		System.out.println("After : " + Arrays.toString(arr));
	}
}