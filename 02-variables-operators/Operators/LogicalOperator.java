package day_16__Operators;

public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		
		// And 
		
        int z = 5;
        if(++z > 5 || ++z >6)         //Logical OR
        {
        	z++;
        }
        System.out.println(z); //7
        
        System.out.println(".............");
        z = 5;
        if(++z > 5 | ++z >6)     //Boolean OR
        {
        	z++;
        }
        System.out.println(z); //8
        
        
        System.out.println(".................");
        
        z = 5;
         
        if(++z > 5 & ++z >6)    
        {
        	System.out.println("Inside if");
        	z++;
        }
        System.out.println(z); 
        
        
        
        
        
        
        
        
        
        
        
	}

}
