package day_56_Abstract_class__and__abstract_methods;

abstract class Shape
{
	public abstract void draw();       //private,static and final [not allowed] 
}

class Square extends Shape
{
	public void draw() 
	{
		System.out.println("Drawing Square");
	}
}

class Rectangle extends Shape
{
	public void draw() 
	{
		System.out.println("Drawing Rectangle");
	}
}

public class AbstractDemo1 
{
	public static void main(String[] args) 
	{
		Shape s = null;
		
		s = new Square();
		s.draw();
		
		s = new Rectangle();
		s.draw();
	}

}
