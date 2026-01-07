package day_63_lambda_expression_MCQ;

interface Course3
{
	String courseName();
	String facultyName();
	String duration();
}
//@FunctionalInterface                      //not functional Interface
interface NIT3 extends Course3
{
	String nit(String courseName);
}
public class FunctionalInterfaceExample3
{
	public static void main(String[] args) {
	//	NIT3 nit = (String course) -> course;         //not functional Interface
	//	System.out.println(nit.nit("Java"));
	}
}