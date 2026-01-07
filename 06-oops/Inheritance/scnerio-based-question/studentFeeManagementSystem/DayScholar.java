package blc;

public class DayScholar extends Student
{
	protected double transportFee;

	public DayScholar(int studentId, String studentName, double examFee, double transportFee) {
		super(studentId, studentName, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", studentName=" + studentName
				+ ", examFee=" + examFee + "]";
	}
	
	public void payFee(double amount) 
	{
		double pay = transportFee+examFee;
		if(amount < pay) {
			System.out.println("Payable Amount is :"+(pay-amount));
		}
		else {
			System.out.println("Refundabale Amount is :"+(pay-amount));
		}
	
	}
}

