package multidimesionalarray;

/*
Count all sorted rows in a matrix 

Given a matrix of m*n size, the task is to count all the rows  
in a matrix that are sorted either in strictly increasing order  
or in strictly decreasing order?
*/
public class CountRowsStrictlySorting { 
	 
	 public static boolean isAscending(int brr[]) { 
	  for (int i = 0; i < brr.length - 1; i++) { 
	   if (brr[i] > brr[i + 1]) 
	    return false; 
	  } 
	  return true; 
	 } 
	 
	 public static boolean isDescending(int brr[]) { 
	  for (int i = 0; i < brr.length - 1; i++) { 
	   if (brr[i] < brr[i + 1]) 
	    return false; 
	  } 
	  return true; 
	 } 
	 
	 public static void main(String[] args) { 
	 
	  int arr[][] = { { 1, 1, 1, 4, 5 }, { 9, 8, 5, 4, 3 }, { 2, 3, 4, 0, 1 }, { 2, 4, 5, 6, 8 } }; 
	int c = 0; 
	for (int i = 0; i < arr.length; i++) { 
	if (CountRowsStrictlySorting.isAscending(arr[i]) || CountRowsStrictlySorting.isDescending(arr[i])) 
	c++; // 2 
	} 
	System.out.println(c); 
	} 
	} 