package blc;



public record Customer(int custId,String customerName,String pickupLocation,String dropLocation,int distance,String phone)
{
	public Customer
	{
		try 
		{
			if(custId<=0) 
			{
				throw new IllegalArgumentException("Validation Error: Customer ID must be positive.");
			}
			
			else if(customerName==null||customerName.isBlank()) 
			{
				throw new IllegalArgumentException("Validation Error: Customer name cannot be null or blank.");
			}
			
			else if(pickupLocation==null||pickupLocation.isBlank()) 
			{
				throw new IllegalArgumentException("Validation Error: Pickup location cannot be null or blank. ");
			}
			else if(phone==null||phone.isBlank()) 
			{
				if(phone.length()!=10)
				throw new IllegalArgumentException("Validation Error: Phone number must be 10 digits only.");
				else
				{
					throw new IllegalArgumentException("Validation Error: Phone number cannot be null or blank.");
				}
			}
			else if(distance <0) 
			{
				throw new IllegalArgumentException("Validation Error: Distance cannot be negative.");
			}
			else if(dropLocation==null||dropLocation.isBlank()) 
			{
				throw new IllegalArgumentException("Validation Error: Drop location cannot be null or blank.");
			}
		}	
		catch (IllegalArgumentException e) 
		{
			System.err.println(e.getMessage());
		}
	}
}



