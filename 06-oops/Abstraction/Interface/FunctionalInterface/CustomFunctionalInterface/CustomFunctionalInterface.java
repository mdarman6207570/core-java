package day_63_Predefined_Functional_Interface;

@FunctionalInterface
interface TriFunction<T,U,V,R>
{
	R myApply(T t,U u, V v);
}

public class CustomFunctionalInterface 
{
	public static void main(String[] args) 
	{
		TriFunction<Integer,Integer,Integer,String> myFun = (t,u,v) -> t+u+v+"";
		System.out.println(myFun.myApply(100, 200, 300));
	}

}
