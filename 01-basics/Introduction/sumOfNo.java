class sumOfNo 
{
	public static void main(String[] args) 
	{
		int a= Integer.parseInt(args[0]);
	    int sum=0;
	  if(a>9 && a<100){
		  int r=a%10;
		  a=a/10;
		  sum=r+a;
		  System.out.println("sum of dugit is: "+sum);
	  }
	  else{
		System.out.println("Enter no between 10 to 100");
	  }
	}
}


