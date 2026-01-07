package equals_hashcode;

import java.util.Arrays;

public class HascodeDemo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int brr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.hashCode(arr));
		System.out.println(Arrays.hashCode(brr));
	}
}