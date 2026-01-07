package day_60__Abstract_class_and_abstract_method_Scenario;

class Triangle extends Shape
{

	double base;
	double height;

	public Triangle(double base, double height) 
	{
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	double getArea() {
		
		return 0.5*this.base*this.height;
	}

	@Override
	void printDetails() 
	{
		System.out.println("Type = Triangle");
		System.out.println("Base = "+this.base);
		System.out.println("Height = "+this.height);
		System.out.println("Area = "+getArea());
		
	}	
}
