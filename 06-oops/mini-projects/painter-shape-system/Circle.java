package paintershape;

class Circle implements Shape {
	
	private static final double PI =3.14;
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	@Override
	public void findArea(){
		System.out.println("Circle Area: "+ (PI * radius * radius));
	}
}