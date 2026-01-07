package multidimesionalarray;
/*
Printing Boundary Elements of a Matrix. 
Given a matrix of size n x m. Print the boundary elements of the matrix. Boundary elements are 
those elements that are not surrounded by elements in all four directions, i.e. elements in the 
first row, first column, last row, and last column
*/
public class PrintBoundery 
{ 
	 
	 public static void main(String[] args) { 
	 
	  int arr[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4 }, { 5, 5, 5, 
	5, 5 } }; 
	 
	  for (int i = 0; i < arr.length; i++) { 
	   for (int j = 0; j < arr.length; j++) { 
	    if (i == 0 || j == 0 || i == arr.length - 1 || j == arr.length - 1) 
	     System.out.printf("%4d", arr[i][j]); 
	    else 
	     System.out.printf("%4c", ' '); 
	   } 
	   System.out.println(); 
	  } 
	 
	 } 
	} 
	 
