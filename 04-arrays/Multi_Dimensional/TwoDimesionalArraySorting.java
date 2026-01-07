package multidimesionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimesionalArraySorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[][] = new int[size][size];
		System.out.println("Enter " + (size * size) + " Elements into array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
// Sort Logic : 1 
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
  } 
  System.out.println(Arrays.toString(arr)); 

			// Sort Logic : 2

			for (int i = 0; i < arr.length; i++) {
				int x[] = arr[i];

				for (int j = 0; j < x.length; j++) {
					for (int k = j + 1; k < x.length; k++) {
						if (x[j] > x[k]) {
							int t = x[j];
							x[j] = x[k];
							x[k] = t;
						}
					}
				}
			}
			System.out.println(Arrays.deepToString(arr));

		}
	}