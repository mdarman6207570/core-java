package loose_coupling;

public class LooseCoupling {

	public static void main(String[] args) 
	{
		Restaurent.acceptAndPrepare(new Tea());
		Restaurent.acceptAndPrepare(new Coffee());
		Restaurent.acceptAndPrepare(new Boost());
	}

}
