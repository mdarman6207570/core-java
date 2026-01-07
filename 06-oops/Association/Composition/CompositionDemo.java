package day_46_HAS_A_RELATION;

class Engine
{
	private String type;
	private int horsePower;
	
	public Engine(String type, int horsePower) 
	{
		super();
		this.type = type;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() 
	{
		return "Engine [type=" + type + ", horsePower=" + horsePower + "]";
	}
}

class Car
{
	private String name;
	private int model;
	private final Engine engine;
	
	public Car(String name,int model) 
	{
		super();
		this.name = name;
		this.model = model;
		this.engine = new Engine("Battery",1200);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", engine=" + engine + "]";
	}
	
	
}

public class CompositionDemo 
{
	public static void main(String[] args) 
	{
		Car nexon = new Car("Nexon EV", 2025);
		System.out.println(nexon);
	}

}
