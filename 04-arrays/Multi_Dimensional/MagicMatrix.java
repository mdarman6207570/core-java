package multidimesionalarray;

//-> if sum of principal diagonal, sum of horizontal diagonal , each row sum & each columns sum is equal then the matrix is magic matrix. 
public class MagicMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

		int pd = 0;
		int hd = 0;

		for (int i = 0; i < arr.length; i++) {
			pd = pd + arr[i][i];
			hd = hd + arr[i][arr.length - 1 - i];
		}

		if (pd == hd) {
			for (int i = 0; i < arr.length; i++) {
				int rsum = 0, csum = 0;
				for (int j = 0; j < arr.length; j++) {
					rsum = rsum + arr[i][j]; // 2+7+6
					csum = csum + arr[j][i];
				}
				if (pd != rsum || csum != hd) {
					System.out.println("Not Magic Matrix");
					return;
				}
			}
			System.out.println("Magic Matrix");
		} else {
			System.out.println("Not Magic Matrix");
		}

	}
}