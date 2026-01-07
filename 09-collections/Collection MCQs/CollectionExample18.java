package collection_mcqs;

import java.util.ArrayList;

public class CollectionExample18 {
	public static void main(String... args) {
		ArrayList obj = new ArrayList();
		obj.add("A");
		obj.set(0, "B");
		System.out.println(obj.size());
	}
}