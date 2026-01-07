package DAY43_Inheritance_Mcq;

class A{
	A(){
		System.out.println("A Constructor");
	}
}
class B extends A 
{ 
B() 
{ 
System.out.println("B Constructor"); 
} 
} 

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();

	}

}
