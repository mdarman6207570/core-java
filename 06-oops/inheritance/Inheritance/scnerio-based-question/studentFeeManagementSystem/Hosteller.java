package blc;

public class Hosteller extends Student
{
	protected double hostelFee;

	public Hosteller(int studentId, String studentName, double examFee, double hostelFee) 
	{
		super(studentId, studentName, examFee);
		this.hostelFee = hostelFee;
	}

	@Override
	public String toString() 
	{
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", studentName=" + studentName
				+ ", examFee=" + examFee + "]";
	}
	
	public void payFee(double amount) 
	{
		double pay = hostelFee+examFee;
		if(amount < pay) {
			System.out.println("Payable Amount is :"+(pay-amount));
		}
		else {
			System.out.println("Refundabale Amount is :"+(pay-amount));
		}
	
	}
	
}
