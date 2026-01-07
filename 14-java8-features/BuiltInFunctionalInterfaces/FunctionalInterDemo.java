package day_61_Functional_Programming_Lambda_Expression;

@FunctionalInterface
interface Drawable
{
	void draw();
}

public class FunctionalInterDemo 
{
	public static void main(String[] args) 
	{
		Drawable d = new Drawable()
		{
			public void draw()
			{
				System.out.println("Drawing ");
			}
		};
		d.draw();
	}

}
