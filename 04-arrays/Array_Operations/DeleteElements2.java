package arrays_operations;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElements2 {
	public static int[] deleteEle(int arr[], int ele) {
//{ 1, 2, 3, 4, 5, 3, 3 } 
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			if (arr[i] == ele) {
				for (int j = i; j < l - 1; j++) {
					arr[j] = arr[j + 1];
				}
				l--;
				i--;
			}
		}

		return Arrays.copyOf(arr, l);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 1, 2, 3, 4, 5, 3, 9, 3, 3, 3 };
		System.out.println("Enter element to delete...");
		int del = sc.nextInt(); // 3
		System.out.println("Before : " + Arrays.toString(arr));
		arr = deleteEle(arr, del);
		System.out.println("After : " + Arrays.toString(arr));

	}

}
