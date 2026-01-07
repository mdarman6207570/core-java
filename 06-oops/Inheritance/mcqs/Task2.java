package DAY43_Inheritance_Mcq;

class Alpha 
{ 
Beta b = new Beta(); 
public Alpha() 
{ 
System.out.println("Alpha class constructor"); 
} 
{ 
System.out.println("Non static block of Alpha class"); 
} 
} 
class Beta
{ 
	 public Beta() 
	 { 
	 System.out.println("Beta class constructor"); 
	 } 
	 } 

public class Task2 {

	public static void main(String[] args) {
		new Alpha();

	}

}
