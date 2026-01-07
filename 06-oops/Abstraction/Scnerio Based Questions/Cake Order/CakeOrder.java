package elc;

import blc.OrderedCake;

public class CakeOrder 
{

	public static void main(String[] args) 
	{
		OrderedCake c1 = new OrderedCake();
        System.out.println(c1);

        
        OrderedCake c2 = new OrderedCake("Round", "Chocolate", 4);
        System.out.println(c2);

        
        OrderedCake c3 = new OrderedCake("Square", "Pineapple", 3, "Arman");
        System.out.println(c3);
	}

}
