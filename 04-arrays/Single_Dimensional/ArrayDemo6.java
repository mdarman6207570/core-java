package singledimesional__customarray;

import java.util.Arrays;

abstract class Shape {
}

class Square extends Shape {
}

class Circle extends Shape {
}

public class ArrayDemo6 {
	public static void main(String[] args) {
		Shape arr[] = new Shape[2];
		arr[0] = new Square();
		arr[1] = new Circle();
		System.out.println(Arrays.toString(arr));
	}
}