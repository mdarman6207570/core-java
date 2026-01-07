package day_63_lambda_expression_MCQ;

@FunctionalInterface
interface NIT4 
{
	String nit(String courseName);
}
interface Course4 extends NIT4
{
	String courseName();
	String facultyName();
	String duration();
}
public class FunctionalInterfaceExample4
{
	public static void main(String[] args) {
		NIT4 nit = (String course) -> course;
		System.out.println(nit.nit("Java"));
	}
}
