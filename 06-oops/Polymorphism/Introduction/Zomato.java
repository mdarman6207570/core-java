package day_46_Polymorphism;

class Order
{
	private String orderId;
	private String itemName; 
	private double price;
	
	public Order(String orderId, String itemName, double price) 
	{
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.price = price;
	}

	public String getOrderId() 
	{
		return orderId;
	}

	public String getItemName() 
	{
		return itemName;
	}

	public double getPrice() 
	{
		return price;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price + "]";
	}
}

class Customer
{
	private String name;
	private String email;
	private String address;
	private long mobileNo;
	private Order order;
	
	public Customer(String name, String email, String address, long mobileNo, Order order) 
	{
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", order=" + order + "]";
	}

	
}

public class Zomato
{
	public static void main(String[] args) 
	{
		Order order = new Order("123456", "Laptop", 1200.50);
		Customer customer = new Customer("James", "james@example.com","ameerpet", 1234567890,order);
		System.out.println(customer);
	}

}
