package inner_class;

interface Vehicle
{
	void run();
}

public class AIC3 
{
  public static void main(String[] args) 
    {
	   Vehicle car = new Vehicle() {
		
		@Override
		public void run() 
		{
	        System.out.println("Car is running!!!");			
		}
	};
	  car.run();
    }
}
