package day_60__Abstract_class_and_abstract_method_Scenario;

class Rectangle extends Shape
{

	double length;
	double breadth;

	public Rectangle(double length, double breadth) 
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double getArea() {
		
		return this.length*this.breadth;
	}

	@Override
	void printDetails() 
	{
		System.out.println("Type = Rectangle");
		System.out.println("Length = "+this.length);
		System.out.println("Length = "+this.breadth);
		System.out.println("Area = "+getArea());
		
	}	
}