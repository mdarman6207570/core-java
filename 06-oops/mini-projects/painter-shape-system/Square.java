package paintershape;

class Square implements Shape {
	
	private double s;
	
	public Square(double s){
		this.s = s;
	}
	
	@Override
	public void findArea(){
		System.out.println("Square Area: "+ (s * s));
	}
}