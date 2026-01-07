 package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo5 
{
	public static void main(String[] args) 
	{
		//create a HashMap to store book titles and their availability (true=available, false=borrowed)
	    HashMap<String,Boolean> library = new HashMap<>();
	    
	    library.put("Core Java", true);
	    library.put("Advance Java", true);
	    library.put("HTML", false);
	    library.put("JavaScript", true);
	    
	    //Display the initial library status
	    System.out.println("Initial Library Status :");
	    library.forEach((k,v)->System.out.println(k+" : "+v));
        
	    //Borrow a book
	    String BookToBorrow = "Advance Java";
	    
	    if(library.containsKey(BookToBorrow) && library.get(BookToBorrow))
	    {
	    	library.put(BookToBorrow, false);
	    	System.out.println(BookToBorrow+" Book to borrowed successfully");
	    	
	    }
	    else
	    {
	    	System.out.println(BookToBorrow+" Book is not available");
	    }
	    
	    
	    String  bookToReturn = "HTML";
	    if(library.containsKey(bookToReturn) && !library.get(bookToReturn))
	    {
	    	library.put(bookToReturn, true);
	    	System.out.println(bookToReturn+" Book has returned successfully");
	    	
	    }
	    else
	    {
	    	System.out.println(bookToReturn+" Book is not available in Llibrary");
	    }
	    
	    library.forEach((k,v) -> System.out.println(k+" : "+v));
	    
	    String bookToCheck = "JavaScript";
	    
	    if(library.containsKey(bookToCheck))
	    {
	    	String availability = library.get(bookToCheck)?"available":"borrowed";
	    	System.out.println(bookToCheck+" Book is "+availability+" .");
	    }
	    else
	    {
	    	System.out.println(bookToCheck+" is not in the library");
	    }
	    
	    //Display the final library status
	    System.out.println("Final Library Status :");
	    for(Map.Entry<String, Boolean> entry : library.entrySet())
	    {
	    	String status = entry.getValue()?"Available":"Borrowed";
	    	System.out.println("Book: "+entry.getKey()+", Status: "+status);
	    }
	}

}
