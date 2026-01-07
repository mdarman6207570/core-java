package multidimesionalarray;

public class MaxOfEachRow {

	public static void main(String[] args) {
		int arr[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };
		for (int i = 0; i < arr.length; i++) {
			int x[] = arr[i];
			int max = x[0];
			for (int j = 0; j < x.length; j++) {
				if (x[j] > max)
					max = x[j];
			}
			System.out.println("max number of " + (i + 1) + " row :" + max);
		}
	}
}