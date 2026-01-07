package blc;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable
{
	private Integer customerId;
	private String customerName;
	private Double customerBill;
	
	public Customer(Integer customerId, String customerName, Double customerBill) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	
	
	public static Customer getCustomerObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id :");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Customer Name :");
		String name = sc.nextLine();
		System.out.println("Enter Customer Bill :");
		double bill = Double.parseDouble(sc.nextLine());
		return new Customer(id, name, bill);
	}


	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
	
}
