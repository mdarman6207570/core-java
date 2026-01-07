package generics;

import java.util.ArrayList;
import java.util.List;

record Dog(String name)
{
	public static List<Dog> getDogObject()
	{
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("A"));
		dogs.add(new Dog("B"));
		dogs.add(new Dog("C"));
		
		return dogs;
	}
}

public class Test4
{
	public static void main(String[] args) 
	{
		Dog dog = Dog.getDogObject().get(1);
		System.out.println(dog);
	}
}
