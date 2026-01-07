package equals_hashcode;

import java.util.Arrays;

public class ArraysAndObjectClassHashcode {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int brr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Hash code by Arrays class hashCode() method");
		System.out.println(Arrays.hashCode(arr));
		System.out.println(Arrays.hashCode(brr));
		System.out.println("Hash code by Object class hashCode() method");
		System.out.println(arr.hashCode());
		System.out.println(brr.hashCode());
		System.out.println(arr == brr);
		System.out.println(arr.equals(brr));
// FALSE <--- checking address 
// FALSE <--- checking address 
		System.out.println(Arrays.equals(arr, brr)); // FALSE <--- checking containt

	}
}