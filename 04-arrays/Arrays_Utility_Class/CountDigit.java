package utilityclasses;

public class CountDigit { 
	 
	 public static void main(String[] args) { 
	 
	  long arr[] = { 111, 442, 5643, 3938, 88373, 8373663 }; 
	 
	  for (int i = 0; i < arr.length; i++) { 
	   long n = arr[i];  
	   int c = 0; 
	   while (n != 0) { 
	    c++; 
	    n = n / 10; 
	   } 
	   System.out.println(arr[i] + "=" + c); 
	  } 
	 } 
	} 