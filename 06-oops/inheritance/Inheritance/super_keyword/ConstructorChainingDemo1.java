package Constructor___Chaining;


class Alpha
{

	public Alpha() {
		super();
		System.out.println("Alpha class no argument constructor!!");
	}

	
	
}

class Beta extends Alpha
{
	
	
	public Beta() {
		super();
		System.out.println("Beta class no argument constructor!!");
	}

}

class Gamma extends Beta
{
	public Gamma() {
		super();
		System.out.println("Gamma class no argument constructor!!");
	}
}



public class ConstructorChainingDemo1 {

	public static void main(String[] args) {
		new Gamma();

	}

}
