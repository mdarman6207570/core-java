package day_63_Predefined_Functional_Interface;

import java.util.function.Supplier;

public class SupplierDemo2
{
	public static void main(String[] args) 
	{
		Supplier<Player> p2 = () -> new Player(101, "Arman") ;
		Player player = p2.get();
		System.out.println(player);
	}
}

record Player(Integer id, String name)
{
	
}