package hashMap;

import java.util.HashMap;
import java.util.Objects;

class Customer 
{
	private Integer id;
	private String name;
	
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

}

public class HashMapInternalDemo1
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer(111, "Scott");
		Customer c2 = new Customer(111, "Scott");
		
		System.out.println(c1.hashCode()+" : "+c2.hashCode());
		System.out.println(c1.equals(c2));
		
		System.out.println("................................");
		
		HashMap<Customer, String> map = new HashMap<>();
		map.put(c1, "A");
		map.put(c2, "B");
	
		System.out.println(map.size());
		System.out.println(map);
	}
}
