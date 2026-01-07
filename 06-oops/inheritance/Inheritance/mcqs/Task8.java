package DAY43_Inheritance_Mcq;

class BaseClass 
{ 
BaseClass() 
{ 
System.out.print("*"); 
} 
BaseClass(String str) 
{ 
this(); 
System.out.print("@" + str); 
} 
} 

public class Task8 extends BaseClass 
{ 
Task8() 
{ 
System.out.print("#"); 
} 
Task8(String name) 
{ 
this(); 
System.out.print("$" + name); 
} 
public static void main(String args[]) 
{ 
 new Task8("hello");
} 
} 