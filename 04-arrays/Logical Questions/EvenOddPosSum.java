package array;

public class EvenOddPosSum 
{
	public static void main(String[] args) 
	{
	    int []arr = {1,2,3,4,5,6,7,2,1};

		
		EvenOddPosSum eo = new EvenOddPosSum();
		eo.findEvenandOddPositionElement(arr);
	}
	
	public void findEvenandOddPositionElement(int []arr)
	{
	    int evenSum = 0, oddSum = 0;

	    for(int i = 0; i < arr.length; i++) {
	        if(i % 2 == 0)
	            evenSum += arr[i];
	        else
	            oddSum += arr[i];
	    }

	    System.out.println("Sum of Even position Elements is : " + evenSum);
	    System.out.println("Sum of Odd position Elements is : " + oddSum);
    }
}