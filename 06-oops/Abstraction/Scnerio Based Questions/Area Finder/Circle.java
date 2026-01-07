package day_60__Abstract_class_and_abstract_method_Scenario;

class Circle extends Shape
{

	double radius;

	public Circle(double radius) 
	{
		super();
		this.radius = radius;
	}

	@Override
	double getArea() {
		
		return this.radius*3.14*this.radius;
	}

	@Override
	void printDetails() 
	{
		System.out.println("Type = Circle");
		System.out.println("Length = "+this.radius);
		System.out.println("Area = "+getArea());
	}	
}