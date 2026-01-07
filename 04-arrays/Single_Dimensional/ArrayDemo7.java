package singledimesional__customarray;

import java.util.Arrays;

interface Shape2 {
}

class Square2 implements Shape2 {
}

class Circle2 implements Shape2 {
}

public class ArrayDemo7 {
	public static void main(String[] args) {
		Shape2 arr[] = new Shape2[2];
		arr[0] = new Square2();
		arr[1] = new Circle2();
		System.out.println(Arrays.toString(arr));
	}
}