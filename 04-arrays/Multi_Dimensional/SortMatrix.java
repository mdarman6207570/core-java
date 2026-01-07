package multidimesionalarray;

import java.util.Arrays;

public class SortMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };

		int x = 0;
		int l = 0;

		for (int i = 0; i < arr.length; i++) {
			l = l + arr[i].length;
		}

		int brr[] = new int[l];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				brr[x++] = arr[i][j];
			}
		}

		Arrays.sort(brr);
		x = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = brr[x++];
			}
		}

		System.out.println(Arrays.deepToString(arr));
	}
}