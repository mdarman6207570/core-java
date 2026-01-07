package arbitrary_methodref;

interface MyFunction<T,U,V,R>
{
	R myApply(T t,U u,V v);
}

class Addition
{
	public Integer doSum(String x,String y)
	{
		return Integer.parseInt(x)+Integer.parseInt(y);
	}
}

public class ArbitraryRefDemo4 
{
	public static void main(String[] args) 
	{
		//lambda
		MyFunction<Addition,String,String,Integer> lambda = ((addition,s1,s2) -> addition.doSum(s1, s2));
		System.out.println(lambda.myApply(new Addition(), "100","200"));
		
		//non static method reference
		MyFunction<Addition,String,String,Integer> methodref =Addition::doSum;
				System.out.println(methodref.myApply(new Addition(), "500","200"));
	}
}
