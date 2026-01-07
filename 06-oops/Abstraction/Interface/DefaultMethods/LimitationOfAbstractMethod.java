package day_59__Java_8_Features;

public class LimitationOfAbstractMethod 
{
	public static void main(String[] args) 
	{
		Vehicle v = null;
		
		v = new Car();
		v.run();
		v.horn();
		v.digitalMeter();
		
		System.out.println(".....................");
		
		v = new Bike();
		v.run();
		v.horn();
		v.digitalMeter();
	}

}
