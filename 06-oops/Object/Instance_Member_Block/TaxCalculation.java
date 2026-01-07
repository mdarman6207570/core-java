package day33.passing_object_ref;

public class TaxCalculation {

	public static void main(String[] args) {
		Trainer t = new Trainer(100,"scott",25000,2000,3000,5,2500);
        double ttax = TaxUtil.calculateTax(t);
        System.out.println(ttax);
		
		Manager m = new Manager(101,"king",25000,2000,3000,5);
		double mtax = TaxUtil.calculateTax(m);
        System.out.println(mtax);

		
		Sourcing s = new Sourcing(101,"mahmood",50000,3000,2000,5,10,3000);
		double stax = TaxUtil.calculateTax(s);
        System.out.println(stax);

		
		Employee e = new Employee(105,"asad",25000,4000,6000);
		double etax = TaxUtil.calculateTax(e);
        System.out.println(etax);

	}

}
