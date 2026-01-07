package utilityclasses;

import java.util.Arrays;

public class MergeArray {
	public static int[] mergeArray(int arr[], int brr[]) {
		int crr[] = new int[arr.length + brr.length];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			crr[x++] = arr[i]; // 1 2 3 4 5
		}
		for (int i = 0; i < brr.length; i++) {
			crr[x++] = brr[i]; // 1 2 3 4 5 11 22 33
		}
		return crr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int brr[] = { 11, 22, 33 };
		int[] mergeArray = mergeArray(arr, brr);
		System.out.println(Arrays.toString(mergeArray));
	}
}