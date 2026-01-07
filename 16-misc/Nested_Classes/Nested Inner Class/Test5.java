package innerclass;

class Car
{
	private String name;
	private String model;
	private Engine engine;
	
	public Car(String name, String model, int horsePower) 
	{
		super();
		this.name = name;
		this.model = model;
		this.engine = new Engine(horsePower);
	}
	
	public Engine getEngine() {
	    return engine;
	}
	
	//Inner class
	public class Engine
	{
		private int horsePower;

		public Engine(int horsePower) 
		{
			super();
			this.horsePower = horsePower;
		}
		
		public void start()
		{
			System.out.println("Engine started! HorsePower: "+horsePower);
		}
		
		public void stop()
		{
			System.out.println("Engine stopped");
		}
		
		public void startCar()
		{
			System.out.println("Starting "+name+" "+model);
			engine.start();
		}
		
		public void stopCar()
		{
			System.out.println("Stopping "+name+" "+model);
			engine.stop();
		}
	}
}

public class Test5 {
    public static void main(String[] args) {
        Car myCar = new Car("Swift", "Desire", 1200);

        // Access Engine via getter
        Car.Engine eng = myCar.getEngine();
        eng.startCar();
        eng.stopCar();
    }
}
