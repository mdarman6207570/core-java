package collection_mcqs;

import java.util.ArrayList;
import java.util.Vector;

public class Test17 {
	public static void main(String[] args) {
		Vector<Person> v1 = new Vector<>();
		ArrayList<Person> a1 = new ArrayList<>();

		v1.add(new Person("Alice", 30));
		a1.add(new Person("Alice", 30));

		System.out.println(v1.equals(a1));
		System.out.println(v1.hashCode());
		System.out.println(a1.hashCode());
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person p2) {
			if (this.age == p2.age && this.name.equals(p2.name)) {
				return true;
			} else {
				return false;
			}
		} else {
			System.err.println("Comparison is not possible");
			return false;
		}
	}

	public int hashCode() {
		return name.hashCode() + age;
	}
}