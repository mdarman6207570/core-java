package DAY43_Inheritance_Mcq;

class Base9
{ 
Base9() 
{ 
System.out.println("Base()"); 
} 
Base9(int x) 
{ 
System.out.println("Base(int): " + x); 
} 
} 

class Derived extends Base9 
{ 
Derived() 
{ 
this(20); 
System.out.println("Derived()"); 
} 
Derived(int y) 
{ 
super(y); 
System.out.println("Derived(int): " + y); 
} 
} 

public class Task9 
{ 
public static void main(String[] args) 
{ 
new Derived(); 
} 
}
