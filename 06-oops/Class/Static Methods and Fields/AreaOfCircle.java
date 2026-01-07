package day_20_;

class GetArea
{
	public static String area(double r) 
	{
		if(r < 0)
		{
			return ""+(-1);
		}
		else 
		{
			final double PI = 3.14;
			double areaOfCircle = PI*r*r;
			return ""+areaOfCircle;
		}
	}
}

public class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		
		String circle = GetArea.area(4);
		System.out.println("Area type (String) ="+circle);
		
		//convert string into double 
		double areaOfCircle = Double.parseDouble(circle);
		
		System.out.println("Area type (Double) ="+areaOfCircle);
	}

}
