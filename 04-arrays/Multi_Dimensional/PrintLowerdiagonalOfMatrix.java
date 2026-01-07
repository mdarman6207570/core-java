package multidimesionalarray;

public class PrintLowerdiagonalOfMatrix {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j > i)
					System.out.printf("%4d", 0);
				else
					System.out.printf("%4d", arr[i][j]);
			}

			System.out.println();
		}
	}
}