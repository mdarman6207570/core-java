package day_53_InstanceOfOperator___Override_Main_Method;

class Alpha
{
	
}

class Beta extends Alpha
{
	
}

class Gamma extends Beta
{
	
}

public class InstanceOfDemo2 
{
	public static void main(String[] args) 
	{
		Gamma g = new Gamma();
		
		if(g instanceof Gamma)
		{
			System.out.println("g is Pointing to Gamma Object");
		}
		
		if(g instanceof Beta)
		{
			System.out.println("g is Pointing to Betaa Object");
		}
		
		if(g instanceof Alpha)
		{
			System.out.println("g is Pointing to Alpha Object");
		}
	}

}
