package single_level_inheritance;

class Super
{
	private int x,y;
	
	public void setData(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	
	public int getY() {
		return y;
	}
}

class Sub extends Super
{
	public void showData()
	{
		System.out.println("x value is :"+this.getX());
		System.out.println("y value is :"+this.getY());
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.setData(100, 200);
		sub.showData();
	}

}
