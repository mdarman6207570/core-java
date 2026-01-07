package DAY43_Inheritance_Mcq;

class Alpha11
{ 
	Alpha11(String msg) 
{ 
System.out.println("Alpha "+msg); 
} 
} 
class Beta11 extends Alpha11 
{ 
public Beta11() 
{ 
super("class constructor"); 
System.out.println("Beta class constructor!!"); 
} 
} 
public class Task11
{ 
public static void main(String[] argv) 
{ 
new Beta11(); 
} 
} 