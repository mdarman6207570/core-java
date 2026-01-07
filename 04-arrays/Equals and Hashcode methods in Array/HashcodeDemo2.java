package equals_hashcode;

import java.util.Arrays;

public class HashcodeDemo2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int brr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.hashCode(arr));
		System.out.println(Arrays.hashCode(brr));
		if (Arrays.hashCode(arr) - Arrays.hashCode(brr) > 0) {
			System.out.println("Arr" + Arrays.toString(arr));
		} else if (Arrays.hashCode(arr) - Arrays.hashCode(brr) < 0) {
			System.out.println("Brr" + Arrays.toString(brr));
		} else {
			System.out.println("Equal");
		}
	}
}