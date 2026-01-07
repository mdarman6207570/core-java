package DAY43_Inheritance_Mcq;

class A6 
{ 
A6() 
{ 
System.out.println("A constructor"); 
}
}
class B6 extends A6 
{ 
B6() 
{ 
this(5); 
System.out.println("B no-arg constructor"); 
} 
B6(int x) 
{  
System.out.println("B int constructor: " + x); 
} 
} 
public class Task6 
{ 
public static void main(String[] args) 
{ 
new B6(); 
} 
} 