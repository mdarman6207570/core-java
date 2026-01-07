package day12.blc;

public class Lion {
	String LionName;
	int LionAge;
	String LionColor;
	Double LionPrice;

	public void setLionData(String name, int age, String color,Double price) {
		LionName = name;
		LionAge = age;
		LionColor = color;
		LionPrice = price;
	}

	 public void getLionInfo() {
		System.out.println("Lion Name is :"+LionName);
		System.out.println("Lionr Age is :"+LionAge);
		System.out.println("Lion Color is :"+LionColor);
		System.out.println("Lion Price is :"+LionPrice);
		
}
}
