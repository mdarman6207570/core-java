package arrays_operations;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
	public static int[] insertEle(int arr[], int ele) {
		int brr[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];
		}
		brr[arr.length] = ele;
		return brr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 }; // 1000x
		System.out.println("Before : " + Arrays.toString(arr));
		arr = insertEle(arr, 100);
		System.out.println("After : " + Arrays.toString(arr));
	}
}