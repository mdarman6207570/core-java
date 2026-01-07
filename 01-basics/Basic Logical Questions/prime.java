class  prime
{
	public static void main(String[] args) 
	{
		int a= Integer.parseInt(args[0]);
		int cnt=0;
		for(int i=2;i<a;i++){
			if(a%i==0)cnt++;
	   }
	if(cnt==0) System.out.println("No is Prime");
	else System.out.println("No is Not Prime");
   }
}
