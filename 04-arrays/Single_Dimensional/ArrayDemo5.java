package singledimesional__customarray;

import java.util.Arrays;
import java.util.Scanner;

class Employee4 {
	int eid;
	String ename;
	double esal;

	public Employee4(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public String toString() {
		return "Empid = " + eid + " Empname = " + ename + " EmpSal = " + esal;
	}
}

public class ArrayDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		Employee4 arr[] = new Employee4[size];
//      
//  
// reading elements and storing into the array    
		for (int i = 0; i < arr.length; i++) {
			System.out.println("<=== Enter " + (i + 1) + " record of Employee ===>");
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter salary");
			double sal = sc.nextDouble();
			arr[i] = new Employee4(id, name, sal);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
//  
		}

		for (Employee4 s : arr) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(arr));
	}
}