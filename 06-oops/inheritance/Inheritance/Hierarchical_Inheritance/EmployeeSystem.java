package elc;

import blc.PermanentEmployee;
import blc.ContractEmployee;

import java.util.Scanner;
public class EmployeeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Enter permanent employee Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter permanent employee Name :");
		String name = sc.nextLine();
        
		System.out.println(" Enter permanent employee Salary :");
		double salary = Double.parseDouble(sc.nextLine());
		
	    PermanentEmployee pe = new PermanentEmployee(id,name,salary);
	    System.out.println(pe);
	    pe.netSalary();
	   
	 
	    
	    System.out.println("==============================================");
	    System.out.println("Enter contract employee Id :");
		int ceid = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter contract employee Name :");
		String cename = sc.nextLine();
        
		System.out.println("Enter contract employee Salary :");
		double cesalary = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter contract duration in year :");
		int cedur = Integer.parseInt(sc.nextLine());
		
		ContractEmployee ce = new ContractEmployee(ceid, cename,cesalary,cedur);
	    System.out.println(ce);
	   
	}

}
