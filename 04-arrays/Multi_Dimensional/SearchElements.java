package multidimesionalarray;

public class SearchElements { 
	 
	 public static void main(String[] args) { 
	 
	  int arr[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } }; 
	  int ele = 100; 
	  boolean flag = false; 
	  for (int i = 0; i < arr.length; i++) { 
	   for (int j = 0; j < arr[i].length; j++) { 
	    if (arr[i][j] == ele) { 
	     System.out.println(i + "," + j); 
	     flag = true; 
	     break; 
	    } 
	   } 
	   if (flag) 
	    break; 
	  } 
	 
	  if (flag == false) 
	   System.out.println("Not found"); 
	 
	 } 
	}