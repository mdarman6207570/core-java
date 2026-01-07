package arrays_operations;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElements1 {
	public static int[] deleteEle(int arr[], int ele) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				c++;
			}
		}

		int brr[] = new int[arr.length - c];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ele) {
				brr[x++] = arr[i];
			}
		}

		return brr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 1, 2, 3, 4, 5, 3, 3 };
		System.out.println("Enter element to delete...");
		int del = sc.nextInt(); // 3
		System.out.println("Before : " + Arrays.toString(arr));
		arr = deleteEle(arr, del);
		System.out.println("After : " + Arrays.toString(arr));
	}
}