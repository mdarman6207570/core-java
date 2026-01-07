package day_44__Compile_Time_Constant;

class Sample
{
	public static final int MAX_VALUE = 500;  //Compile time constant
}

public class ComileTimeConstantDemo1 
{
	public static void main(String[] args) 
	{ 
		System.out.println(Sample.MAX_VALUE);  //.class will not loaded due to Compile time constant 
	}

}
