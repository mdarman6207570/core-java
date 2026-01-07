package generics;

import java.util.Iterator;

abstract class Animal
{
	public abstract void checkup();
}

class Dog extends Animal
{

	@Override
	public void checkup() 
	{
		System.out.println("Dog checkup!!!");	
	}
	
}

class Cat extends Animal
{

	@Override
	public void checkup() 
	{
		System.out.println("Cat checkup!!!");	
	}
	
}

class Bird extends Animal
{

	@Override
	public void checkup() 
	{
		System.out.println("Bird checkup!!!");	
	}
	
}

public class Test8 
{
	public void checkAnimals(Animal animals[])
	{
	   for(Animal animal : animals)
	   {
		   animal.checkup();
	   }
	}
	
	public static void main(String[] args) 
	{
		Dog[] dogs = {new Dog(),new Dog()};
		
		Cat cats[] = {new Cat(),new Cat(),new Cat()};
		
		Bird birds[] = {new Bird(),new Bird()};
		
		Test8 t = new Test8();
		
		t.checkAnimals(dogs);
		t.checkAnimals(cats);
		t.checkAnimals(birds);
	}

}
