package day_63_Predefined_Functional_Interface;

import java.util.function.Supplier;

public class SupplierDemo1 
{
	public static void main(String[] args) 
	{
		Supplier<String> s1 = () -> 40+40+"NIT"+80+80;
		System.out.println(s1.get());
	}
}
