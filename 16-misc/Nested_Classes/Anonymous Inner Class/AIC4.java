package inner_class;

interface Cycle
{
	void run();
}

public class AIC4 
{
  public static void main(String[] args) 
    {
	   Cycle avon = () -> System.out.println("Avon is running");
	  avon.run();
    }
}
