package day_32.mcq;


class Customers
{
        private String name;
        private int id;
	public Customers(String name , int id)
	{
	this.name=name;
	this.id=id;
	}
	public void setId(int id) //setter 
	{
	this.id=id;
	}
	public int getId() //getter
	{
	return id;
	}
}


class Test3 {
	public static void main(String[] args) 
	{
		int val=100;
		Customers c = new Customers("Ravi",2);
		m1(c);
		//GC
		System.out.println(c.getId());
		}
		public static void m1(Customers c)
		{
		c.setId(5);
		c = new Customers("Rahul",7);
		c.setId(9);
		System.out.println(c.getId());
	}
}
