package day33.passing_object_ref;

public class TaxUtil {
	public static double calculateTax(Employee e) {
		double gsalary = e.calculateGrossSalary();
	
		if(gsalary>50000) {
			return gsalary*0.20;
		}
		else
			return gsalary*0.05;
			
	}
	
	
	public static double calculateTax(Manager m) {
		double gsalary = m.calculateGrossSalary();
		
		if(gsalary>50000) {
			return gsalary*0.20;
		}
		else
			return gsalary*0.05;
			
	}

	
	public static double calculateTax(Trainer t) {
		double gsalary = t.calculateGrossSalary();
		
		if(gsalary>50000) {
			return gsalary*0.20;
		}
		else
			return gsalary*0.05;
			
	}
	
	public static double calculateTax(Sourcing s) {
		double gsalary = s.calculateGrossSalary();
	
		if(gsalary>50000) {
			return gsalary*0.20;
		}
		else
			return gsalary*0.05;
			
	}
	
	
	
}
