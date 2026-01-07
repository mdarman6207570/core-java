class swap 
{
	public static void main(String[] a) 
	{
		int b= Integer.parseInt(a[0]);
        int c= Integer.parseInt(a[1]);
		
		//swap
		//2 3
		 b=b+c;  //5
		 c=b-c;  //2  
		 b=b-c;  //3
		 
		 System.out.println("After swapping a is:"+ b);
		 System.out.println("After swapping b is:"+ c);
		
	}
}
