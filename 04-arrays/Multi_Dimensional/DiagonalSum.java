package multidimesionalarray;


/*
 * Efficiently compute sums of diagonals of a matrix 
Given a 2D square matrix, find the sum of elements in Principal and horizontal diagonals. For 
example, consider the following 4 X 4 input matrix. 
 */
public class DiagonalSum {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int n = matrix.length;
        int principalSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            principalSum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Principal Diagonal Sum = " + principalSum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
    }
}
