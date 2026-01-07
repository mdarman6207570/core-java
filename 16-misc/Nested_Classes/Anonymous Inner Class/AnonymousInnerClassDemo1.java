package day_57__Annoymous_Inner_Class;

class Bird
{
	public void roam() 
	{
		System.out.println("Generic Bird is roaming");
	}
}

public class AnonymousInnerClassDemo1 
{
	public static void main(String[] args) 
	{
		//Anonymous Inner Class
		Bird parrot = new Bird()
		{
			
	    @Override
		public void roam()
		 {
			System.out.println("Parrot bird is roaming");
		  }
	   };
	   
	   
	 //Anonymous Inner Class
	 		Bird sparrow = new Bird()
	 		{
	 			
	 	    @Override
	 		public void roam()
	 		 {
	 			System.out.println("Sparrow bird is roaming");
	 		  }
	 	   };
	 	   
	 	   parrot.roam();
	 	   sparrow.roam();
	}
}
