package array;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
	    int []arr = {1,2,3,4,5,6,7,2,1};

		
		EvenOdd eo = new EvenOdd();
		eo.findEvenandOddPositionElement(arr);
	}
	
	public void findEvenandOddPositionElement(int []arr)
	{
	    System.out.print("Even position Elements : ");
	    for(int i = 0; i < arr.length; i += 2) {
	        System.out.print(arr[i] + " ");
	    }

	    System.out.println();
	    System.out.print("Odd position Elements : ");
	    for(int i = 1; i < arr.length; i += 2) {
	        System.out.print(arr[i] + " ");
    }
	

	}
}
