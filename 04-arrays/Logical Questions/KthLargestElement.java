package array;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int arr[] = {5, 2, 9, 1, 7, 3, 8};

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        
        Arrays.sort(arr);

       
        int kthLargest = arr[arr.length - k];

        // Step 3: Print result
        System.out.println(k + "th largest element is : " + kthLargest);

        sc.close();
    }
}
