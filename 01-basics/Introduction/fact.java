class fact
{
	public static void main(String[] a) 
	{
		int b= Integer.parseInt(a[0]);
      
		int factt=1;
		for(int i=b;i>0;i--){
			factt *=i;
		}
		 System.out.println("factorial is:"+ factt);
}

}

