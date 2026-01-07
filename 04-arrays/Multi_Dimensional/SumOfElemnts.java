package multidimesionalarray;

public class SumOfElemnts { 
	 
	 public static void main(String[] args) { 
	 
	  int arr[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } }; 
	   
	  int sum=0; 
	   
	  for(int i=0;i<arr.length;i++) 
	  { 
	   for(int j=0;j<arr[i].length;j++) 
	   { 
	    sum=sum+arr[i][j]; 
	   } 
	  } 
	   
	  System.out.println("Sum of all element is :"+sum); 
	 } 
	} 