package paintershape;

class  Customer{
	public static void main(String[] args) {
		Painter hk = new Painter();
		
		hk.draw(new Rectangle(5, 6));
     	hk.draw(new Square(5));
		hk.draw(new Circle(5));

	}
}