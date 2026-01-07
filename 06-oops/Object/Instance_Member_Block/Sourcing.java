package day33.passing_object_ref;

public class Sourcing {
	 private int sourceId;
	  private String sourceName;
	  private double basicSalary;
	  private double HRAPer;
	  private double DAPer;
	  private int enrollmentTarget;
	  private int enrollmentReached;
	  private double perkPerEnrollment;

	  
	  
	  public Sourcing(int sourceId, String sourceName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}



	  public double  calculateGrossSalary() {
		  return basicSalary +HRAPer +DAPer+(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
		  
	    }
}
