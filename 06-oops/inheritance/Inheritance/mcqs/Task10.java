package DAY43_Inheritance_Mcq;

class Alpha9
{ 
public Alpha9(String msg) 
{ 
System.out.println("Alpha "+msg); 
} 
} 
class Beta10 extends Alpha9
{ 
public Beta10() 
{ 
super(getMessage()); 
System.out.println("Beta class constructor!!"); 
} 
public static String getMessage() 
{ 
return "class constructor"; 
} 
} 
public class Task10 
{ 
public static void main(String[] argv) 
{ 
new Beta10(); 
} 
}
