package Method_Overriding;



class Alpha
{

	public String toString() {
		return "Alpha";
	}
	
}

class Beta extends Alpha
{
	public String toString() {
		System.out.println(super.toString());
		return "Beta";
	}
}

class Gamma extends Beta
{
	public String toString() {
		System.out.println(super.toString());
		return "Gamma";
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		Gamma g = new Gamma();
		System.out.println(g);
	}

}
