package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class Animal2
{
	public abstract void checkup();
}

class Dog2 extends Animal2
{

	@Override
	public void checkup() 
	{
		System.out.println("Dog checkup!!!");	
	}
	
}

class Cat2 extends Animal2
{

	@Override
	public void checkup() 
	{
		System.out.println("Cat checkup!!!");	
	}
	
}

class Bird2 extends Animal2
{

	@Override
	public void checkup() 
	{
		System.out.println("Bird checkup!!!");	
	}
	
}

public class Test9 
{
	public void checkAnimals(List<Animal2> animals)
	{
	   for(Animal2 animal : animals)
	   {
		   animal.checkup();
	   }
	}
	
	public static void main(String[] args) 
	{
		List<Dog2> dogs = new ArrayList<>();
		
		dogs.add(new Dog2());
		dogs.add(new Dog2());
		
        List<Cat2> cats = new ArrayList<>();
		
        cats.add(new Cat2());
        cats.add(new Cat2());
        
        List<Bird2> birds = new ArrayList<>();
		
        birds.add(new Bird2());
        birds.add(new Bird2());
		
		Test9 t = new Test9();
        
		/*
		t.checkAnimals(dogs);
		t.checkAnimals(cats);
		t.checkAnimals(birds);
		*/
	}

}
