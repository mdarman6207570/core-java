package array;

import java.util.Arrays;

public class SelectionSort {
	public static void sortArray(int brr[]) {
		for (int i = 0; i < brr.length; i++) {
			for (int j = i + 1; j < brr.length; j++) {
				if (brr[i] > brr[j]) {
					int t = brr[i];
					brr[i] = brr[j];
					brr[j] = t;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 7, 1, 2, 5, 3, 6, 4 };
		System.out.println("Before Sort : " + Arrays.toString(arr));
		SelectionSort.sortArray(arr);
		System.out.println("After sort :" + Arrays.toString(arr));
	}
}
