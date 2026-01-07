package utilityclasses;

import java.util.Arrays;

//Binary Search

public class BinarySearch { 
	 
	 public static int binarySearchAl(int a[], int key) { 
	  Arrays.sort(a); 
	 
	  int low = 0; 
	  int high = a.length - 1; 
	 
	  while (low <= high) { 
	   int mid = (low + high) / 2; 
	   int midVal = a[mid]; 
	 
	   if (midVal < key) 
	    low = mid + 1; 
	   else if (midVal > key) 
	    high = mid - 1; 
	   else 
	    return mid; // key found 
	  } 
	  return -1; // key not found 
	 } 
	 
	 public static void main(String[] args) { 
	 
	int a[] = { 1, 2, 3, 4, 4, 4, 4, 6, 7, 8, 9 }; 
	if (binarySearchAl(a, 4) >= 0) { 
	System.out.println("Available"); 
	} else { 
		System.out.println("Not Available");
	} 
	} 
	} 