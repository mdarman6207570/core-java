package blank_final_field;

class LIC
{
	final double installment;
	
//	{
//		installment =20000;   //error 
//	}

	public LIC() {
		installment = 25000;
	}
	
}


public class BlankFinalFieldDemo3 {

	public static void main(String[] args) {
	LIC l = new LIC();
	System.out.println(l.installment);
	}

}