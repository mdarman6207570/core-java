package array;

import java.util.Arrays;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 1, 6};

        // Step 1: Remove duplicates and sort
        arr = Arrays.stream(arr).distinct().sorted().toArray();
        
        int secondSmallest = arr[1];
        int secondLargest = arr[arr.length - 2];

        System.out.println("2nd smallest element is : " + secondSmallest);
        System.out.println("2nd largest element is  : " + secondLargest);
    }
}
