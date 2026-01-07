package generics;

class Fruit
{
	
}

class Apple extends Fruit
{
	@Override
	public String toString() 
	{
		return "Apple";
	}
}

class Basket<E>
{
	private E element;
	public Basket(E element)
	{
		this.element = element;
	}
	
	public E getElement()
	{
		return this.element;
	}
}

public class Test15 
{
	public static void main(String[] args) 
	{
		Basket<Fruit> basket = new Basket<>(new Apple());
		Apple apple =(Apple) basket.getElement();
		System.out.println(apple);
	}

}
