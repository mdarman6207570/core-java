package string;

public class TimingDemo 
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer();
		for(int i=1;i<=1000000;i++)
		{
			sb1.append(" Technology");
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by StringBuffer class is :"+(endTime - startTime));
	
	    System.out.println("...............................");
	    
	      startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=1000000;i++)
		{
			sb.append(" Technology");
		}
		
		 endTime = System.currentTimeMillis();
		System.out.println("Time taken by StringBuilder class is :"+(endTime - startTime));
	}

}
