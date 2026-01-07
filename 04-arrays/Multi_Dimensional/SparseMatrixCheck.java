package multidimesionalarray;

import java.util.Scanner;

public class SparseMatrixCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int zeroCount = 0, nonZeroCount = 0;

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 0)
                    zeroCount++;
                else
                    nonZeroCount++;
            }
        }

        if (zeroCount > nonZeroCount) {
            System.out.println("Matrix is a Sparse Matrix");
        } else {
            System.out.println("Matrix is not a Sparse Matrix");
        }

        sc.close();
    }
}
