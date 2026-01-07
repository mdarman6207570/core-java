package DAY43_Inheritance_Mcq;

class Parent 
{ 
int x = 10; 
} 
class Child extends Parent 
{ 
void print() 
{ 
System.out.println(x); 
} 
} 
public class Task5
{ 
public static void main(String[] args) 
{ 
new Child().print(); 
} 
} 