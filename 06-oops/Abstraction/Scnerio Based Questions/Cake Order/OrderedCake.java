package blc;

public class OrderedCake extends Cake
{
	private String message;

	
	public OrderedCake() 
	{
		super("Round", "Vanilla", 1);
	}

	
	public OrderedCake(String shape, String flavour, int quantity) 
	{
		super(shape, flavour, quantity);
	}

	
	public OrderedCake(String shape, String flavour, int quantity, String message) 
	{
		super(shape, flavour, quantity);
		this.message = message;
	}


	@Override
	public String toString() {
		 double totalPrice = getQuantity() *Cake.price;
		
		if(message != null)
		{
			return "A "+getShape()+" "+getFlavour() +"Cake of "+getQuantity()+"KG is Ready with Happy Birthday "+message+" @ Rs."+(totalPrice);
		}
		else
		{
			return super.toString();
		}
	}
	
	
	
}
