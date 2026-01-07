package singledimesional__customarray;

import java.util.Arrays;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class ArrayDemo3 {
	public static void main(String[] args) {
		Object arr[] = { 1, 10.5, "java", true, 'A', new Employee(1, "raj"), 2, 3, 4 };
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		for (Object obj : arr)
			System.out.println(obj);
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for (Object o : arr) {
			if (o instanceof Integer) {
				sum = sum + (int) o;
			}
		}
		System.out.println(sum);
	}
}