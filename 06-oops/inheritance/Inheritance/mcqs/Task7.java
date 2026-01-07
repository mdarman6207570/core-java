package DAY43_Inheritance_Mcq;

class A7
{ 
A7() 
{ 
this(10); 
System.out.println("A no-arg"); 
} 
A7(int x) 
{ 
System.out.println("A int: " + x); 
} 
} 
public class Task7
{ 
public static void main(String[] args) 
{ 
new A7(); 
} 
}
