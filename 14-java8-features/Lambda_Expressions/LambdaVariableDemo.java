package lambda;

interface Drawable
{
	void draw();
}

public class LambdaVariableDemo 
{
	public static void main(String[] args) 
	{
		String shapeType = "Circle";    //final Or Effectively final
		//shapeType = "Rectangle";//Invalid
		
		Drawable d1 = () -> System.out.println("Drawing "+shapeType);
		d1.draw();
	}

}
