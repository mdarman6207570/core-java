package singledimesional__customarray;

import java.util.Arrays;

class Employee2 {
	int eid;
	String ename;
	double esal;

	public Employee2(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public String toString() {
		return "Empid = " + eid + " Empname = " + ename + " EmpSal = " + esal;
	}

	public class ArrayDemo4 {
		public static void main(String[] args) {
			Employee2 e1 = new Employee2(1, "raj", 10000);
			Employee2 e2 = new Employee2(2, "rahul", 20000);
			Employee2 e3 = new Employee2(3, "suraj", 30000);
			Employee2 arr[] = { e1, e2, e3, new Employee2(4, "juber", 40000) };

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			for (Employee2 s : arr) {
				System.out.println(s);
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}