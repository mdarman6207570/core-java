package inner_class;

abstract class Shape
{
	abstract void draw();
}

public class AIC2 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Shape circle  = new Shape() {
			
			@Override
			void draw() 
			{
				System.out.println("Drawing Circle!!");
			}
		};
		circle.draw();
	}
}
