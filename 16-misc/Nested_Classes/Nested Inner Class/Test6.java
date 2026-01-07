package innerclass;

import innerclass.Car.Engine;

class Laptop
{
	private String brand;
	private String model;
	private Motherboard motherboard;
	
	public Laptop(String brand, String model, String motherboardmodel, String chipset) {
		super();
		this.brand = brand;
		this.model = model;
		this.motherboard = new Motherboard(motherboardmodel, chipset);
	}
		
	public void switchOn()
	{
		System.out.println("Turning on "+brand +" "+model);
		this.motherboard.boot();
	}
	
	//Motherboard inner class
	public class Motherboard
	{
		private String model;
		private String chipset;
		
		public Motherboard(String model, String chipset) 
		{
			super();
			this.model = model;
			this.chipset = chipset;
		}
		
		public void boot()
		{
			System.out.println("Booting "+brand+" "+model+" with "+ chipset +" chipset");
		}
	}	
}

public class Test6 
{
	public static void main(String[] args) 
	{
		Laptop laptop = new Laptop("HP", "ENVY","IRIS","Intel");
		laptop.switchOn();
	}

}
